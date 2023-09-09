package LoggingSystem;

public class LoggerInfo extends LoggerSystem{
    public LoggerInfo(LoggerSystem loggerSystem) {
        super(loggerSystem);
    }
    @Override
    public void print(int logLevel,String message) {
        if(logLevel == Info) {
            System.out.println(message+" from info");
        }else{
            nextLoggerSystem.print(logLevel,message);
        }
    }
}
