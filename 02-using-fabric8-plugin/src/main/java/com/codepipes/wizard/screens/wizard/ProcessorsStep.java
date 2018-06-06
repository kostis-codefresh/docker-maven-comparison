package com.codepipes.wizard.screens.wizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProcessorsStep extends WizardStep{
	
	private static final Logger logger = LoggerFactory.getLogger(ProcessorsStep.class);

	public ProcessorsStep() {
		mav = new ModelAndView();
		mav.setViewName("wizard/cpu");
		mav.addObject("selectedTab", "steps");
		mav.addObject("step", "step3");
	}
	
	@RequestMapping(value = "/cpu.html", method = RequestMethod.GET)
	public ModelAndView show() {
		logger.debug("CPU page is showing");
		
		prepare();
		return mav;
	}
	
	@RequestMapping(value = "/cpu.html", method = RequestMethod.POST, params = "processors")
	public ModelAndView apply(@RequestParam("processors") String processors) {
		
		logger.debug("Saving CPU info");
		settings.setCpuN(Integer.parseInt(processors));
		return getNext().show();
	}
	
	private void prepare()
	{
		mav.addObject("pageName", settings.toString());
		mav.addObject("processors",settings.getCpuN().toString());
	}
}
