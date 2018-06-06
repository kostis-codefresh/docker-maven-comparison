package com.codepipes.wizard.screens.wizard;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SummaryStepTest {

	@Test
	public void show() {
		SummaryStep step = new SummaryStep();
		assertEquals("Expected two values",step.mav.getViewName(),"wizard/summary");
	}

}
