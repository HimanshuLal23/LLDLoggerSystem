package LoggingSystem;

public abstract class LoggerSystem {
    public static int Info = 1;
    public static int Error = 2;
    public static int Debug = 3;
    LoggerSystem nextLoggerSystem;
    public LoggerSystem(LoggerSystem nextLoggerSystem) {
        this.nextLoggerSystem = nextLoggerSystem;
    }
    public void print(int loglevel,String message) throws NullPointerException{
        if(nextLoggerSystem!=null) {
            nextLoggerSystem.print(loglevel,message);
        }else {
            throw new NullPointerException();
        }
    }
}
