package com.rockiey.test.integration.testng;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ITWeekly {
	Logger logger = Logger.getLogger(this.getClass());
	@Test
	public void smokeTest() {
		logger.debug("this is a weekly test");
	}
}
