package com.codepipes.wizard.screens.wizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codepipes.wizard.vsphere.VmCreator;

@Controller
public class SummaryStep extends WizardStep{
	
	private static final Logger logger = LoggerFactory.getLogger(SummaryStep.class);

	private VmCreator vmCreator = null;
	
	public SummaryStep() {
		mav = new ModelAndView();
		mav.setViewName("wizard/summary");
		mav.addObject("selectedTab", "steps");
		mav.addObject("step", "step6");
	}
	
	@RequestMapping(value = "/summary.html", method = RequestMethod.GET)
	public ModelAndView show() {
		logger.debug("Summary page is showing");
		
		prepare();
		return mav;
	}
	
	@RequestMapping(value = "/summary.html", method = RequestMethod.POST, params = "finished")
	public ModelAndView finished() {
		
		logger.debug("Finished");
		
		/*
		 * The vmSphere implementation is dummy and always succeeds
		 */
		boolean result = vmCreator.createVm(settings);
		logger.info("Result is {}",result);
		mav.addObject("result", "VM "+settings.getName()+" was created!.");
		
		prepare();
		return mav;
	}
	
	private void prepare()
	{
		mav.addObject("pageName", settings.toString());
		mav.addObject("settings",settings);
	}

	public void setVmCreator(VmCreator vmCreator) {
		this.vmCreator = vmCreator;
	}
	
	
	
}
