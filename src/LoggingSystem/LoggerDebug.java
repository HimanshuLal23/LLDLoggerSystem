package LoggingSystem;

public class LoggerDebug extends LoggerSystem{
    public LoggerDebug(LoggerSystem loggerSystem) {
        super(loggerSystem);
    }
    @Override
    public void print(int logLevel,String message) {
        if(logLevel == Debug) {
            System.out.println(message+" from debug");
        }else{
            nextLoggerSystem.print(logLevel,message);
        }
    }
}
