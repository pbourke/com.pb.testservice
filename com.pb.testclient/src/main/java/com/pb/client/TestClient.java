package com.pb.client;

import com.pb.TestService;

public class TestClient {
	private TestService testService;
	
	public void setTestService(final TestService ts) {
		testService = ts;
	}
	
	public void callService() {
		System.out.println("Service says: " + testService.message());
	}
}
