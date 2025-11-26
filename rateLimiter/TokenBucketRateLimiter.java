package rateLimiter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * TokenBucketRateLimiter implements the token bucket algorithm for rate limiting.
 * Each user has an independent token bucket.
 */
public class TokenBucketRateLimiter implements RateLimiter
{
	// Maximum number of tokens a user's bucket can hold
	private int capacity;
	// Number of tokens to be added to the bucket per second
	private int refillTokensPerSecond;
	// Stores the current number of tokens for each user
	private Map<String, Integer> userTokenBuckets = new ConcurrentHashMap<>();
	// Stores the last time (in ms) tokens were refilled for each user
	private Map<String, Long> userLastRefillTime = new ConcurrentHashMap<>();

	/**
	 * Constructor to initialize the rate limiter with bucket capacity and refill rate.
	 * @param capacity Maximum tokens in the bucket
	 * @param rateFillInterval Number of tokens to add per second
	 */
	public TokenBucketRateLimiter(int capacity, int rateFillInterval)
	{
		this.capacity = capacity;
		this.refillTokensPerSecond = rateFillInterval;
	}

	/**
	 * Checks if a request from a user can proceed based on their token bucket.
	 * Refills tokens as needed and decrements if allowed.
	 * Synchronized to ensure thread safety for all users (could be optimized).
	 * @param userId The unique identifier for the user
	 * @return true if the request can proceed, false otherwise
	 */
	@Override
	public synchronized boolean canProceed(String userId)
	{
		// Get the current time in milliseconds
		var currentTime = System.currentTimeMillis();
		// If the user is making a request for the first time, initialize their bucket and last refill time
		userTokenBuckets.putIfAbsent(userId, capacity);
		userLastRefillTime.putIfAbsent(userId, currentTime);
		// Get the last time tokens were refilled for this user
		var lastRefillTime = userLastRefillTime.get(userId);
		// Calculate how many seconds have passed since the last refill
		long timeDiff = (currentTime - lastRefillTime) / 1000;
		// If at least one second has passed, refill tokens
		if (timeDiff > 0)
		{
			// Calculate the new number of tokens, ensuring it does not exceed capacity
			int newTokenToAdd = Math.min(capacity,
					userTokenBuckets.get(userId) + (int) timeDiff * refillTokensPerSecond);
			// Update the user's token count
			userTokenBuckets.put(userId, newTokenToAdd);
			// Update the last refill time to now
			userLastRefillTime.put(userId, currentTime);
		}
		// If the user has at least one token, allow the request and decrement the token count
		if (userTokenBuckets.get(userId) > 0)
		{
			userTokenBuckets.put(userId, userTokenBuckets.get(userId) - 1);
			return true;
		}
		// If no tokens are available, deny the request
		return false;
	}
}
