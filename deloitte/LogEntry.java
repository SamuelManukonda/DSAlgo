package deloitte;

public class LogEntry {

    private String jobId;
    private int timestamp;
    private String status;

    public LogEntry(String jobId, int timestamp, String status) {
        this.jobId = jobId;
        this.timestamp = timestamp;
        this.status = status;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "LogEntry{" + "jobId='" + jobId + '\'' + ", timestamp=" + timestamp + ", status='" + status + '\'' + '}';
    }
}
