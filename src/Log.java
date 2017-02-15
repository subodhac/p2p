import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log{

    private static Logger logger;
    private static FileHandler fileHandler;
    private static SimpleFormatter simpleFormatter;

    //Log file Name
    private static final String filename = "ApplicationLog.log";

    //Number of log files
    private static final int count= 1;

    //Size of each log file
    private static final int limit = 1024*100; //100 Kb

    //Append into log file
    private static final boolean append = true;

    public static void init() throws IOException {
        simpleFormatter = new SimpleFormatter();
        fileHandler = new FileHandler(filename, limit, count, append);
        fileHandler.setFormatter(simpleFormatter);

        logger.addHandler(fileHandler);
    }

    public static Logger getLogger(String name){
        logger = Logger.getLogger(name);
        return logger;
    }

    public void logInfo(String msg){
        logger.info(msg);
    }

}