/**
 * 
 */
package com.codepipes.wizard.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

/**
 * @author kkapelon
 *
 */
public class VirtualMachineSettings {
	
	private String name = null;
	
	private OperatingSystem type= null;
	
	private Integer cpuN;
	
	private Long memory;
	
	private List<Integer> hardDisks;
	
	public VirtualMachineSettings()
	{
		name="";
		type = OperatingSystem.UBUNTU;
		cpuN=1;
		memory=256L;
		hardDisks = new ArrayList<Integer>();
		hardDisks.add(100);
		hardDisks.add(500); //just some default values
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public OperatingSystem getType() {
		return type;
	}

	public void setType(OperatingSystem type) {
		this.type = type;
	}
	

	public Integer getCpuN() {
		return cpuN;
	}

	public void setCpuN(Integer cpuN) {
		this.cpuN = cpuN;
	}

	public Long getMemory() {
		return memory;
	}

	public void setMemory(Long memory) {
		this.memory = memory;
	}

	public List<Integer> getHardDisks() {
		return hardDisks;
	}

	public void setHardDisks(List<Integer> hardDisks) {
		this.hardDisks = hardDisks;
	}
	
	@Override
	public String toString()
	{
		StringBuilder description = new StringBuilder("VM ");
		description.append(StringUtils.defaultString(name));
		
		return description.toString();
	}
	
	

}
