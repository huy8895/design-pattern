package chain_of_responsibility.example;

public class AppLogger {



    public static Logger getLogger() {
        Logger consoleLogger = new ConsoleLogger(LogLevel.DEBUG);
        Logger fileLogger = consoleLogger.setNextLogger(new FileLogger(LogLevel.ERROR));
        fileLogger.setNextLogger(new EmailLogger(LogLevel.FATAL));
        return consoleLogger;
    }
}
