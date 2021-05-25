package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerExample {
	
	private static final Logger LOGGER = LogManager.getLogger(LoggerExample.class);
	
	public static void main(String[] args) {
		
		LOGGER.info("This is info logger");
		LOGGER.debug("This is a debug logger");
		LOGGER.warn("This is a warn logger");
		LOGGER.error("This is a error logger");
		LOGGER.fatal("This is a fatal logger"); 
	}
}
