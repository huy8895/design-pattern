package chain_of_responsibility.example;

/**
 * Logger: là một abstract class Handler, cho phép thực hiện một chain logger dựa vào giá trị LogLevel ứng với từng
 * Handler. Nếu mức độ lỗi (severity) lớn hơn hoặc bằng với LogLevel mà nó có thể handle thì sẽ thực hiện
 * writeMessage(), đồng thời gọi Hanlder kế tiếp nếu có.
 */
public abstract class Logger {
    protected LogLevel logLevel;

    protected Logger nextLogger;

    public Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public Logger setNextLogger(Logger nextLogger){
        this.nextLogger = nextLogger;
        return nextLogger;
    }

    public void log(LogLevel severity, String msg){
        if (logLevel.getLevel() <= severity.getLevel()){
            writeMessage(msg);
        }
        if (nextLogger != null) {
            nextLogger.log(severity, msg);
        }
    }

    protected abstract void writeMessage(String msg);
}
