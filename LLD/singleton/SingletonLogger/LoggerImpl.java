package LLD.singleton.SingletonLogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {
    private static volatile LoggerImpl instance = null;
    public PrintWriter writer;
    String logFile;

    private LoggerImpl() {
    }

    @Override
    public void log(String logLevel, String message) {
        if (logLevel == null || message == null) {
            throw new IllegalStateException();
        }

        if (writer != null) {
            writer.print(LocalDateTime.now() + " " + logLevel + " " + message);
        } else {
            throw new IllegalStateException();
        }

    }

    @Override
    public void setLogFile(String filePath) {
        if (filePath != null && !filePath.equals(logFile)) {
            logFile = filePath;
            if (writer != null)
                writer.close();
            try {
                writer = new PrintWriter(new FileWriter(logFile, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getLogFile() {
        return logFile;
    }

    @Override
    public void flush() {
        if (writer != null) {
            writer.flush();
        }
    }

    @Override
    public void close() {
        if (writer != null) {
            writer.close();
            writer = null;
        }
    }

    public static LoggerImpl getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new LoggerImpl();
                }
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance = null;
    }
}