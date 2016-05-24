package com.kooppi.ci.jenkins.demo.helloworld.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.*;

public class DummyCase {

	private static final Logger logger = LoggerFactory.getLogger(DummyCase.class);
	
	@Test
	public void demo(){
		logger.info("Begin demo");
		assertThat("demo").isEqualToIgnoringCase("Demo");
		logger.info("End demo");
	}
}
