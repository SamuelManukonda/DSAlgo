package rateLimiter;

public class LeakyBucketRateLimiter implements RateLimiter{
    @Override
    public boolean canProceed(String userId) {
        return false;
    }
}
