package rateLimiter;

public interface RateLimiter
{

	boolean canProceed(String userId);
}
