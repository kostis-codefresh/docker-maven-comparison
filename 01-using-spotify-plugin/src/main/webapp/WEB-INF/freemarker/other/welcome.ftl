<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>Description</h2>
			<p>This application is a simple web wizard using Spring MVC</p>

<p>			
			The goal to this exercise is to write Web application called “Create Virtual Machine wizard”. The wizard consists of 6 pages/steps:</p>

<p><ol>
<li>	Name of the VM</li>
<li>	Operating system </li>
<li>	Number of CPUs (1-8) </li>
<li>	Memory (256MB – 16GB) </li>
<li>	Hard disks </li>
<li>	Summary page </li>
</ol></p>

<p>
Each step provides information that is required for creating a Virtual Machine (VM).  Data collected from each step should be stored in a data object in memory. The data object is used as parameter for remote call to function createVm(…). When wizard completes you should call createVM function and display the result of execution in the Web Application.
</p> 

<p>
Assumptions:
</p>

<p><ul>
<li>createVM function is part of the back-end of another application. You can define the return type of createVM as well as the number and type of input parameters.</li>
<li>createVM function is making remote call to this imaginary external application, which actually creates the virtual machine. That function returns true or false depending on whether operation is successful or not.</li>
</ul>
</p>

			
			
			
			<!-- Column 1 end -->
		</div>
		<div class="col2">
		<!-- Column 2 start -->
			<h2>Options</h2>
			<ul>
			<li><a href="vmname.html">Start the Wizard</a></li>
			<li><a href="http://www.vmware.com/">Visit VMware</a></li>
			<li><a href="http://www.springsource.com/">Visit SpringSource</a></li>
			</ul>
			<!-- Column 2 end -->
		</div>
	</div>
</div>
<#include "../common/footer.html" parse=false>

