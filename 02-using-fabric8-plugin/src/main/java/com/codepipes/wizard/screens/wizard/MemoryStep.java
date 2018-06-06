package com.codepipes.wizard.screens.wizard;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemoryStep extends WizardStep {
	private static final Logger logger = LoggerFactory
			.getLogger(MemoryStep.class);


	public MemoryStep() {
		mav = new ModelAndView();
		mav.setViewName("wizard/memory");
		mav.addObject("selectedTab", "steps");
		mav.addObject("step", "step4");
	}

	@RequestMapping(value = "/memory.html", method = RequestMethod.GET)
	public ModelAndView show() {
		logger.debug("Memory page is showing");

		prepare();
		return mav;
	}

	@RequestMapping(value = "/memory.html", method = RequestMethod.POST, params = "megabytes")
	public ModelAndView apply(@RequestParam("megabytes") String megabytes) {
		if (StringUtils.isEmpty(megabytes) || !StringUtils.isNumeric(megabytes) || Long.parseLong(megabytes) < 256 || Long.parseLong(megabytes) > 16384) {
			logger.debug("Error with memory");
			mav.addObject("errors", "Memory should be a numeric value within limits");
		} else {
			logger.debug("Saving memory information");
			settings.setMemory(Long.parseLong(megabytes));
			return getNext().show();
		}
		prepare();

		return mav;
	}

	private void prepare() {
		mav.addObject("pageName", settings.toString());
		mav.addObject("megabytes", settings.getMemory().toString());
	}

}
