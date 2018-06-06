/**
 * 
 */
package com.codepipes.wizard.vsphere;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.codepipes.wizard.model.VirtualMachineSettings;

/**
 * @author kkapelon
 *
 */
public class VsphereVmCreator implements VmCreator{
	private static final Logger logger = LoggerFactory.getLogger(VsphereVmCreator.class);
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean createVm(VirtualMachineSettings settings) {
		//Dummy implementation
		logger.info("Creating a VM with name {}", settings.getName());
		return true;
	}

}
