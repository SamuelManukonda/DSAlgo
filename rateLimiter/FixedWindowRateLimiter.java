package rateLimiter;

/**
 * FixedWindowRateLimiter implements a fixed window rate limiting algorithm.
 * It allows up to 'capacity' requests in each fixed time window of 'windowSizeInMillis' milliseconds.
 * The window resets after the specified duration, and the request count starts over.
 */
public class FixedWindowRateLimiter implements RateLimiter
{
	// Maximum number of requests allowed per window
	int requestsAllowedPerWindow;
	// Duration of each window in milliseconds
	long windowSizeInMillis;
	// Start time of the current window (in milliseconds)
	long windowStartTime;
	// Number of requests made in the current window
	int requestCount = 0;

	/**
	 * Constructor to initialize the window size and capacity.
	 * @param windowSizeInMillis Duration of each window in milliseconds
	 * @param requestsAllowedPerWindow Maximum number of requests allowed per window
	 */
	public FixedWindowRateLimiter(long windowSizeInMillis, int requestsAllowedPerWindow)
	{
		this.windowSizeInMillis = windowSizeInMillis;
		this.requestsAllowedPerWindow = requestsAllowedPerWindow;
		// Set the start time of the first window to the current time
		this.windowStartTime = System.currentTimeMillis();
	}

	/**
	 * Checks if a request from a user can proceed based on the current window.
	 * If the window has expired, resets the window and request count.
	 * Allows the request if the count is below capacity.
	 * @param userId The unique identifier for the user (not used in this implementation)
	 * @return true if the request can proceed, false otherwise
	 */
	@Override
	public boolean canProceed(String userId)
	{
		// Get the current time in milliseconds
		long currentTime = System.currentTimeMillis();
		// Check if the current window has expired
		if (currentTime - windowStartTime >= windowSizeInMillis)
		{
			// Reset the window start time and request count
			windowStartTime = currentTime;
			requestCount = 0;
		}
		// If the request count is below capacity, allow the request
		if (requestCount < requestsAllowedPerWindow)
		{
			requestCount++;
			return true;
		}
		// Otherwise, deny the request
		return false;
	}
}
