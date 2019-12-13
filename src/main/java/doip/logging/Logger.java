package doip.logging;

/**
 * Defines several functions for log messages in different log levels
 */
public interface Logger {
	
	public void trace(String message);

	public void debug(String message);

	public void info(String message);

	public void warn(String message);

	public void error(String message);

	public void fatal(String message);
}
