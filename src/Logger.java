public class Logger {
    static LogLevel CURRENT_LEVEL = LogLevel.INFO;

    public enum LogLevel {
        INFO(1),
        DEBUG(2),
        TRACE(3);

        final int value;

        LogLevel(int value) {
            this.value = value;
        }
    }

    public static void setLogLevel(LogLevel logLevel) {
        CURRENT_LEVEL = logLevel;
    }
    public static LogLevel getLogLevel() {
        return CURRENT_LEVEL;
    }

    public static void log(LogLevel level, String message) {
        if (level.value <= CURRENT_LEVEL.value) {
            String nameOfMethod = Thread.currentThread().getStackTrace()[3].getMethodName();
            KeywordUtil.logInfo("[${level}] (${nameOfMethod}) \t ${message}");
        }
    }

    public static void info(String msg) {
        log(LogLevel.INFO, msg);
    }

    public static void debug(String msg) {
        log(LogLevel.DEBUG, msg);
    }

    public static void trace(String msg) {
        log(LogLevel.TRACE, msg);
    }
}
