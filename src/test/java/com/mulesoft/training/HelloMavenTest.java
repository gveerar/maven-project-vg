package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

// Test snippet: http://bit.ly/1Uz2vEN


public class HelloMavenTest extends FunctionalTestCase {
	
	@Test
	public void sayHelloReturnsHelloMaven() throws Exception {
		runFlowAndExpect("mavenFlow", "Hello Maven");
	}
	
	@Override
	protected String getConfigFile() {
		// TODO Auto-generated method stub
		return "maven-project.xml";
	}

}
