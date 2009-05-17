package com.pb.impl;

import java.util.Random;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ApplicationObjectSupport;

import com.pb.TestService;

public class TestServiceImpl extends ApplicationObjectSupport implements TestService, InitializingBean {
	private final Random random = new Random();
	
	public String message() {		
		return "Here is a random number: " + random.nextInt();
	}

	public void afterPropertiesSet() throws Exception {
		logger.warn(getClass() + " bean was created in the TestService");
	}
}
