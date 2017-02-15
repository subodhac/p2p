import java.io.IOException;
import java.util.logging.Logger;


/**
 * Created by subodha on 2/14/17.
 */
public class peerProcess {
    private static final Logger log = Log.getLogger("test");
    private static final Log logger = new Log();

    public static void main(String[] args) throws IOException {
        logger.init();
        System.out.printf("damn");
        //log.info("invalid number of cmd line arguments");
        logger.logInfo("oh yeah!");
        System.out.printf("damn again");

        Constants consst = new Constants();
        ConfigHandler handle = new ConfigHandler();
    }

}
