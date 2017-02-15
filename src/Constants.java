import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Class Constants contains various constants that we use throughout the
 * program. It is not up to date as of now but will be more widely used in the
 * future.
 * 
 * @author Deepak, Mike, Josh
 */
public class Constants {

	/** The the file name of the log file if loggin to file is enabled. */
	public static String logFileName = "BT";

	/** Enable file logging or not. */
	public static boolean isFileLoggingEnabled = true;

	/** Enable console logging or not. */
	public static boolean isConsoleLoggingEnabled = true;

	/**
	 * The log level. This will set the level required for messages to be
	 * logged.
	 */
	public static Level logLevel = Level.OFF;
	
	/** The stats. */
	public static File stats = new File("song.mp3.stats");

	private static final Logger log = Log.getLogger("test");
	private static final Log logger = new Log();

	Constants(){
		//log.info("constructor called");
		logger.logInfo("Consts Constructor called");
	}

}
