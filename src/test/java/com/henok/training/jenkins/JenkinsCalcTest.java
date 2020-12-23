package com.henok.training.jenkins;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JenkinsCalcTest {

	private JenkinsCalculator myCalc;
	@Before
	public void init() {
		this.myCalc = new JenkinsCalculator();
	}
	@Test
	public void addTest() {
		
		assertEquals(10,myCalc.addNumbers(5, 5));
	}
	
	@Test
	public void subtractTest() {
		
		assertEquals(5,myCalc.subtractNumbers(10, 5));
	}

}
