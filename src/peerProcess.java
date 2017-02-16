import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by subodha on 2/14/17.
 */
public class peerProcess {
    private static final Logger log = Log.getLogger("test");
    private static final Log logger = new Log();


    public static void main(String[] args) {
        try{
            Log.init();
            logger.logInfo("Logger Init Successful");
        }
        catch (IOException e){
            logger.logSevere("Logger Init Failed");
        }

        Tester test = new Tester();
        test.runTests();

        Constants constants = new Constants();
        ConfigHandler handle = new ConfigHandler();
    }
}
