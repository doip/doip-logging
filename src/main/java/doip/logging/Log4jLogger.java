package doip.logging;

/**
 * Implementation of the Logger interface using log4j2
 */
class Log4jLogger implements Logger {
	
	private org.apache.logging.log4j.Logger logger = null;
	
	public Log4jLogger(org.apache.logging.log4j.Logger logger) {
		this.logger = logger;
	}

	@Override
	public void trace(String message) {
		this.logger.trace(message);
		
	}

	@Override
	public void debug(String message) {
		this.logger.debug(message);
	}

	@Override
	public void info(String message) {
		this.logger.info(message);
	}

	@Override
	public void warn(String message) {
		this.logger.warn(message);
	}

	@Override
	public void error(String message) {
		this.logger.error(message);
	}

	@Override
	public void fatal(String message) {
		this.logger.fatal(message);
	}

	@Override
	public void log(Level level, String message) {
		this.logger.log(level.getLog4jLevel(), message);
	}

	@Override
	public boolean isTraceEnabled() {
		return this.logger.isTraceEnabled();
	}

	@Override
	public boolean isDebugEnabled() {
		return this.logger.isDebugEnabled();
	}

	@Override
	public boolean isInfoEnabled() {
		return this.logger.isInfoEnabled();
	}

	@Override
	public boolean isErrorEnabled() {
		return this.logger.isErrorEnabled();
	}

	@Override
	public boolean isWarnEnabled() {
		return this.logger.isWarnEnabled();
	}

	@Override
	public boolean isFatalEneabled() {
		return this.logger.isFatalEnabled();
	}
}
