import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log{

    private static Logger logger;
    private static FileHandler fileHandler;
    private static SimpleFormatter simpleFormatter;

    //Log file Name
    private static final String filename = "src/log_peer_1001.log";

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

    /**
     * Logs any general info msg from any Class to the same log file
     */
    public void logInfo(String msg){
        logger.info(msg);
    }

    /**
     * Logs any general error msg from any Class to the same log file
     */
    public void logSevere(String msg){
        logger.severe(msg);
    }

    /**
     * Logs whenever a peer makes a TCP connection to other peer
     *
     * @param id1: ID of the peer who generates the log
     * @param id2: peer connected from peer id1
     */
    public void tcpConnectionInit(int id1, int id2){
        logger.info("Peer " + id1 + " makes a connection to" +
                " Peer " + id2 );
    }

    /**
     * Logs whenever a peer is connected from another peer
     *
     * @param id1: ID of the peer who generates the log
     * @param id2: peer who has made TCP connection to
     */
    public void tcpConnectionMade(int id1, int id2){
        logger.info("Peer " + id1 + " is connected from" +
                " Peer " + id2 );
    }

    /**
     * Logs whenever a peer changes its preferred neighbors
     *
     * @param id1: ID of the peer who generates the log
     * @param ids: String of preferred neighbor list separated by comma
     */
    public void changePrefNeighbours(int id1, String ids){
        logger.info("Peer " + id1 + " has the preferred neighbors "
                +ids );
    }

    /**
     * Logs whenever a peer changes its OU(optimistically unchoked) neighbor
     *
     * @param id1: ID of the peer who generates the log
     * @param ouid: ID of OU neighbor
     */
    public void changeOUNeighbour(int id1, int ouid){
        logger.info("Peer " + id1 + " has the optimistically " +
                "unchoked neighbor " + ouid );
    }

    /**
     * Logs whenever a peer is unchoked by a neighbor
     *
     * @param id1: peer who is unchocked
     * @param id2: peer who unchokes
     */
    public void unchocked(int id1, int id2){
        logger.info("Peer " + id1 + " is unchocked by " +
                id2 );
    }

    /**
     * Logs whenever a peer is chocked by a neighbor
     *
     * @param id1: peer who is chocked
     * @param id2: peer who chockes
     */
    public void chocked(int id1, int id2){
        logger.info("Peer " + id1 + " is chocked by " +
                id2 );
    }

    /**
     * Logs whenever a peer receives a 'have' message
     *
     * @param id1: peer who received the 'have' message
     * @param id2: peer who sent the message
     * @param pInd: piece index contained in the message
     */
    public void haveReceived(int id1, int id2, int pInd){
        logger.info("Peer " + id1 + " received the \"have\" " +
                "message from " + id2 + " for the piece " + pInd );
    }

    /**
     * Logs whenever a peer receives an 'interested' message
     *
     * @param id1: peer who received the 'interested' message
     * @param id2: peer who sent the message
     */
    public void interestedReceived(int id1, int id2){
        logger.info("Peer " + id1 + " received the " +
                "\"interested\" " + " message from " + id2);
    }

    /**
     * Logs whenever a peer receives a 'not interested' message
     *
     * @param id1: peer who received the 'not interested' message
     * @param id2: peer who sent the message
     */
    public void notInterestedReceived(int id1, int id2){
        logger.info("Peer " + id1 + " received the " +
                "\"not interested\" " + " message from " + id2);
    }

    /**
     * Logs whenever a peer finishes downloading a piece
     *
     * @param id1: peer who downloaded the piece
     * @param id2: peer who sent the piece
     * @param pInd: piece index downloaded
     * @param piecesCnt: number of pieces the peer currently has
     */
    public void pieceDownloaded(int id1, int id2, int pInd,
                                      int piecesCnt){
        logger.info("Peer " + id1 + " has downloaded the " +
                "piece " + pInd + " from " + id2 + ". Now the " +
                "number of pieces it has is " +piecesCnt);
    }

    /**
     * Logs whenever a peer downloads the complete file
     *
     * @param id1: peer who completed download
     */
    public void downloadComplete(int id1){
        logger.info("Peer " + id1 + " has downloaded the " +
                "complete file");
    }
}