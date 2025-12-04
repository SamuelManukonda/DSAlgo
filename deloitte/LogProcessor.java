package deloitte;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Identify all the jobs that experience more than 3 failure events within a sliding window of 10min (600s) and all should be sorted order
 */
public class LogProcessor {


    public static void main(String[] args) {
        LogEntry log1 = new LogEntry("A", 100, "success");
        LogEntry log2 = new LogEntry("A", 200, "fail");
        LogEntry log3 = new LogEntry("A", 250, "fail");
        LogEntry log4 = new LogEntry("A", 300, "fail");
        LogEntry log5 = new LogEntry("A", 350, "fail");
        LogEntry log6 = new LogEntry("B", 500, "success");
        LogEntry log7 = new LogEntry("C", 900, "fail");
        LogEntry log8 = new LogEntry("E", 1100, "fail");

        List<LogEntry> list = Arrays.asList(log1, log2, log3, log4, log5, log6, log7, log8);

        Deque<LogEntry> processQueue = new LinkedList<>();



    }
}
