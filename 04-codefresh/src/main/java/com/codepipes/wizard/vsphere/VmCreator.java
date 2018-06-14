package com.codepipes.wizard.vsphere;

import com.codepipes.wizard.model.VirtualMachineSettings;

public interface VmCreator {

	/**
	 * Creates a VM machine
	 * @param settings details for the virtual machine
	 * @return true if success
	 */
	 boolean createVm(VirtualMachineSettings settings);
}
