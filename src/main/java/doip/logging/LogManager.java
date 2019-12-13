package doip.logging;

/**
 * Provides functions to create a instance of a Logger. Currently it uses only log4j2.
 */
public class LogManager {

	/**
	 * Returns an instance of a logger. 
	 * @param clazz Class which uses the logger
	 * @return An instance of a logger based on the argument clazz.
	 */
	public static Logger getLogger(Class<?> clazz) {
		org.apache.logging.log4j.Logger log4jLogger = org.apache.logging.log4j.LogManager.getLogger(clazz);
		return new Log4jLogger(log4jLogger);
	}
	
}
