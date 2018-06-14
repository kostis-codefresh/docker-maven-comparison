package com.codepipes.wizard.screens.wizard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HardDisksStep extends WizardStep{
	
	private static final Logger logger = LoggerFactory.getLogger(HardDisksStep.class);

	public HardDisksStep() {
		mav = new ModelAndView();
		mav.setViewName("wizard/hd");
		mav.addObject("selectedTab", "steps");
		mav.addObject("step", "step5");
	}
	
	@RequestMapping(value = "/hd.html", method = RequestMethod.GET)
	public ModelAndView show() {
		logger.debug("Hard disk page is showing");
		
		prepare();
		return mav;
	}
	
	@RequestMapping(value = "/hd.html", method = RequestMethod.POST, params = {"disk1","disk2"})
	public ModelAndView apply(@RequestParam("disk1") String disk1,@RequestParam("disk2") String disk2) {
		logger.debug("Saving Disk information");
		settings.getHardDisks().clear();
		settings.getHardDisks().add(Integer.parseInt(disk1));
		settings.getHardDisks().add(Integer.parseInt(disk2));
		return getNext().show();
	}
	
	private void prepare()
	{
		mav.addObject("pageName", settings.toString());
		mav.addObject("disk1",settings.getHardDisks().get(0).toString()); //Not very safe I know
		mav.addObject("disk2",settings.getHardDisks().get(1).toString());
	}

	
}
