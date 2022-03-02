package com.test.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeHook() {
		
		System.out.println("I am running a test case");
		
	}
	
	@After
	public void afterHook() {
		
		System.out.println("I am finishing a test case");
		
	}

}