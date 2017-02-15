/**
 * Created by subodha on 2/15/17.
 */
public class ConfigHandler {
    private static final Log logger = new Log();

    ConfigHandler(){
        logger.logInfo("Config Constructor called");
        logger.tcpConnection(1,2);
    }
}
