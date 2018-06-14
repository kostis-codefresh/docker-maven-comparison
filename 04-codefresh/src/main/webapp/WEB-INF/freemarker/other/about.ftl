<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>Technology notes</h2>
			<p>This application uses:</p>

<p><ul>
<li><a href="http://www.springsource.org/spring-framework/">Spring</a> for dependency injection</li>
<li><a href="http://www.springsource.org/features/modern-web">Spring MVC</a> for the web functionality</li>
<li><a href="http://freemarker.org/">Freemarker</a> as a view technology</li>
<li><a href="http://maven.apache.org/">Maven</a> as a build tool</li>
<li><a href="http://commons.apache.org/">Apache Commons</a> StringUtils</li>
<li><a href="http://www.slf4j.org/">slf4j</a> for console logging</li>
</ul></p>

<p>
Some limitations:
</p>

<p>
<ul>
<li>Only basic validation is implemented.  A production app should also have validation on client-side using Javascript</li>
<li>The user can only move back and forth only one step at a time in the wizard</li>
<li>Because of the POST forms, the URL is not always representative of the step. Urls are certainly not bookmarkable</li>
<li>Better error checking and exception handling would be included in a real application</li>
<li>There are no unit tests</li>
<li>I am not a Web designer so the GUI is functional but very spartan.</li>
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

