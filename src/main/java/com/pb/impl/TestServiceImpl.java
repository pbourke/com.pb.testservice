package com.pb.impl;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.util.StringUtils;

import com.pb.TestService;

public class TestServiceImpl extends ApplicationObjectSupport implements TestService, InitializingBean {
	private final Random random = new SecureRandom();
	
	public String message() {		
		StringUtils.capitalize("Some String");
		return "Here is a random number: " + random.nextInt() + " hope you enjoy it!";
	}

	public void afterPropertiesSet() throws Exception {
		logger.warn(getClass() + " bean was created in the TestService");
	}
}
