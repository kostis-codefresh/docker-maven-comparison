/**
 * 
 */
package com.codepipes.wizard.screens.wizard;

import org.springframework.web.servlet.ModelAndView;

import com.codepipes.wizard.model.VirtualMachineSettings;

/**
 * Common functionality for all Spring MVC controllers
 * 
 * @author kkapelon
 *
 */
public abstract class WizardStep {

	protected ModelAndView mav = null;
	
	protected VirtualMachineSettings settings = null;
	
	private WizardStep next = null;
	
	public abstract ModelAndView show();

	public WizardStep getNext() {
		return next;
	}

	public void setNext(WizardStep next) {
		this.next = next;
	}
	
	public void setSettings(VirtualMachineSettings settings) {
		this.settings = settings;
	}
	
	
	
	
}
