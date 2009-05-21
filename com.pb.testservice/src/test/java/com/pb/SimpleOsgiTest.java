package com.pb;

import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;
import org.springframework.osgi.test.AbstractConfigurableBundleCreatorTests;
import org.springframework.osgi.util.OsgiStringUtils;

public class SimpleOsgiTest extends AbstractConfigurableBundleCreatorTests {
	public void testOsgiStarts() {
		System.out.println(bundleContext.getProperty(Constants.FRAMEWORK_VENDOR));
		System.out.println(bundleContext.getProperty(Constants.FRAMEWORK_VERSION));
		System.out.println(bundleContext.getProperty(Constants.FRAMEWORK_EXECUTIONENVIRONMENT));
	}
	
	public void testOsgiEnvironment() throws Exception { 
		Bundle[] bundles = bundleContext.getBundles(); 
		for (int i = 0; i < bundles.length; i++) { 
			System.out.print(OsgiStringUtils.nullSafeName(bundles[i])); 
			System.out.print(", "); 
		} 
		System.out.println(); 
	} 	
}
