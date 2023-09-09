package LoggingSystem;

public class LoggerError extends LoggerSystem{
    public LoggerError(LoggerSystem loggerSystem) {
        super(loggerSystem);
    }
    @Override
    public void print(int logLevel,String message) {
        if(logLevel == Error) {
            System.out.println(message+" from error");
        }else{
            nextLoggerSystem.print(logLevel,message);
        }
    }
}
