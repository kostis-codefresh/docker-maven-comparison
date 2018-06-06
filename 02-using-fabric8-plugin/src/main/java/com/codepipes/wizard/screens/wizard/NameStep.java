/**
 * 
 */
package com.codepipes.wizard.screens.wizard;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kkapelon
 *
 */
@Controller
public class NameStep extends WizardStep{
	
	private static final Logger logger = LoggerFactory.getLogger(NameStep.class);

	public NameStep() {
		mav = new ModelAndView();
		mav.setViewName("wizard/vmname");
		mav.addObject("selectedTab", "steps");
		mav.addObject("step", "step1");
	}

	@RequestMapping(value = "/vmname.html", method = RequestMethod.GET)
	public ModelAndView show() {
		logger.debug("Name of VM page is showing");
		
		prepare();
		return mav;
	}
	
	@RequestMapping(value = "/vmname.html", method = RequestMethod.POST, params = "virtualmachinename")
	public ModelAndView apply(@RequestParam("virtualmachinename") String virtualmachinename) {
		if(StringUtils.isEmpty(virtualmachinename))
		{
			logger.debug("Empty name");
			mav.addObject("errors", "Name cannot be empty");
			prepare();
			
			return mav;
		}
		else
		{
			logger.debug("Saving VM name");
			settings.setName(virtualmachinename);
			return getNext().show();
		}
		
	}
	
	private void prepare()
	{
		mav.addObject("pageName", settings.toString());
		mav.addObject("virtualmachinename",settings.getName());
	}
	
	
}
