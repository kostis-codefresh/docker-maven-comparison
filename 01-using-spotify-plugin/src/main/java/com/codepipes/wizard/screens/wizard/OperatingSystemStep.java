/**
 * 
 */
package com.codepipes.wizard.screens.wizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.codepipes.wizard.model.OperatingSystem;

/**
 * @author kkapelon
 *
 */
@Controller
public class OperatingSystemStep extends WizardStep{

	private static final Logger logger = LoggerFactory.getLogger(OperatingSystemStep.class);

	public OperatingSystemStep() {
		mav = new ModelAndView();
		mav.setViewName("wizard/os");
		mav.addObject("selectedTab", "steps");
		mav.addObject("step", "step2");
	}
	
	@RequestMapping(value = "/os.html", method = RequestMethod.GET)
	public ModelAndView show() {
		logger.debug("OS page is showing");
		
		prepare();
		return mav;
	}
	
	@RequestMapping(value = "/os.html", method = RequestMethod.POST, params = "selectedos")
	public ModelAndView apply(@RequestParam("selectedos") String selectedos) {
		
		logger.debug("Saving OS selection");
		settings.setType(OperatingSystem.valueOf(selectedos));
		return getNext().show();
	}
	
	private void prepare()
	{
		mav.addObject("pageName", settings.toString());
		mav.addObject("selectedos",settings.getType().toString());
	}

	
}
