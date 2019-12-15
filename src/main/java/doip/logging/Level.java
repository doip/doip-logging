package doip.logging;

public class Level {
	
	public static Level INFO;
	
	private org.apache.logging.log4j.Level log4jLevel = null;
	
	static {
		INFO = new Level(org.apache.logging.log4j.Level.INFO);
	}
	
	protected Level(org.apache.logging.log4j.Level level) {
		this.log4jLevel = level;
	}
	
	public static Level getLevel(String name) {
		org.apache.logging.log4j.Level level = org.apache.logging.log4j.Level.getLevel(name);
		return new Level(level);
	}
	
	public org.apache.logging.log4j.Level getLog4jLevel() {
		return this.log4jLevel;
	}
}
