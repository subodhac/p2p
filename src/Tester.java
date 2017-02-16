import org.junit.Test;

/**
 * Created by subodha on 2/15/17.
 */
public class Tester {
    private static final Log logger = new Log();

    public void runTests(){
        runLoggerTests();
    }

    @Test
    private void runLoggerTests(){
        logger.logInfo("debug: logInfo");
        logger.logInfo("debug: logSevere");
        logger.tcpConnectionInit(1001,1004);
        logger.tcpConnectionMade(1001,1004);
        logger.changePrefNeighbours(1001,"1002,1005,1006");
        logger.changeOUNeighbour(1001,1004);
        logger.unchocked(1001,1004);
        logger.chocked(1001,1004);
        logger.haveReceived(1001,1004,15);
        logger.interestedReceived(1001,1004);
        logger.notInterestedReceived(1001,1004);
        logger.pieceDownloaded(1001,1004,15,5);
        logger.downloadComplete(1001);
    }
}
