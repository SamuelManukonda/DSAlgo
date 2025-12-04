package deloitte;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Identify all the jobs that experience more than 3 failure events within a sliding window of 10min (600s) and all
 * should be sorted order
 */
public class LogProcessor
{

	public static Integer WINDOW_LENGTH = 600;

	public static void main(String[] args)
	{
		List<LogEntry> testData = Arrays.asList(
				new LogEntry("X", 100, "fail"),
				new LogEntry("X", 500, "fail"),
				new LogEntry("X", 300, "fail"),
				new LogEntry("X", 700, "fail"), // 100, 300, 500, 700: 4 failures within 600s
				new LogEntry("Y", 1000, "fail"),
				new LogEntry("Y", 1600, "fail"),
				new LogEntry("Y", 1700, "fail"),
				new LogEntry("Y", 1800, "fail"), // 1600, 1700, 1800: 3 failures within 200s
				new LogEntry("Z", 200, "fail"),
				new LogEntry("Z", 900, "fail"),
				new LogEntry("Z", 1500, "fail"), // Spread out, should not be detected
				new LogEntry("W", 400, "fail"),
				new LogEntry("W", 450, "fail"),
				new LogEntry("W", 500, "fail"), // Exactly 3 failures within 100s
				new LogEntry("V", 100, "fail"),
				new LogEntry("V", 800, "fail"),
				new LogEntry("V", 850, "fail"),
				new LogEntry("V", 900, "fail"),
				new LogEntry("V", 950, "fail") // 800, 850, 900, 950: 4 failures within 150s
		);


		Deque<LogEntry> window = new LinkedList<>();

		List<String> results = new ArrayList<>();

		Map<String, List<LogEntry>> map = testData.stream()
				.filter(it -> it.getStatus().equals("fail"))
				.sorted(Comparator.comparingInt(LogEntry::getTimestamp))
				.collect(Collectors.groupingBy(LogEntry::getJobId));

		map.entrySet().forEach(entry -> {
			List<LogEntry> value = entry.getValue();
			for (LogEntry logEntry : value)
			{
				String jobId = logEntry.getJobId();
				window.addLast(logEntry);

				while (window.peekFirst().getTimestamp() < (logEntry.getTimestamp() - WINDOW_LENGTH))
				{
					window.removeFirst();
				}

				if (window.size() > 3)
				{
					results.add(jobId);
					break;
				}
			}
		});

		System.out.println(results);
	}
}
