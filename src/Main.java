import LoggingSystem.LoggerDebug;
import LoggingSystem.LoggerError;
import LoggingSystem.LoggerInfo;
import LoggingSystem.LoggerSystem;

public class Main {
    public static void main(String []args) {
        LoggerSystem loggerSystem = new LoggerError(new LoggerInfo(new LoggerDebug(null)));
        try {
            loggerSystem.print(LoggerSystem.Info, "Hello");
        }catch (NullPointerException ex) {
            System.out.println("NullPointerException caught");
        }
    }
}
