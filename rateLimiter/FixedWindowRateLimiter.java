package rateLimiter;

public class FixedWindowRateLimiter implements RateLimiter
{
	int capacity;
	long windowSizeInMillis;
	long windowStartTime;
	int requestCount = 0;

	public FixedWindowRateLimiter(long windowSizeInMillis, int capacity)
	{
		this.windowSizeInMillis = windowSizeInMillis;
		this.capacity = capacity;
		this.windowStartTime = System.currentTimeMillis();
	}

	@Override
	public boolean canProceed(String userId)
	{
		long currentTime = System.currentTimeMillis();
		if (currentTime - windowStartTime >= windowSizeInMillis)
		{
			// Reset the window
			windowStartTime = currentTime;
			requestCount = 0;

		}
		if (requestCount < capacity)
		{
			requestCount++;
			return true;
		}

		return false;
	}
}
