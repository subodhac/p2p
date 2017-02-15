import java.io.IOException;
import java.util.logging.Logger;


/**
 * Created by subodha on 2/14/17.
 */
public class peerProcess {
    private static final Logger log = Log.getLogger("test");
    private static final Log logger = new Log();

    public static void main(String[] args) throws IOException {
        Log.init();

        logger.logInfo("");

        Constants constants = new Constants();
        ConfigHandler handle = new ConfigHandler();
    }

}
