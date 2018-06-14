<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>Summary</h2>
			
			
			
			<p>Here are all the details for the VM that will be created</p>
			
			<p>
			<table border="1">
			<tr><th>Setting</th><th>Value</th><th>Action</th>
			<tr><td>Name</td><td>${settings.name}</td><td><a href="vmname.html">Change</a></td>
			<tr><td>Operating System</td><td>${settings.type}</td><td><a href="os.html">Change</a></td>
			<tr><td>Number of Processors</td><td>${settings.cpuN}</td><td><a href="cpu.html">Change</a></td>
			<tr><td>Memory (MBs)</td><td>${settings.memory}</td><td><a href="memory.html">Change</a></td>
			<tr><td>Disk1 (MBs)</td><td>${settings.hardDisks[0]}</td><td><a href="hd.html">Change</a></td>
			<tr><td>Disk2 (MBs)</td><td>${settings.hardDisks[1]}</td><td><a href="hd.html">Change</a></td>
			</table>
			</p>
			
			<form action="summary.html" method="post"/>
			<p>
			<input type="hidden" name="finished" value="unused"/>
			<input type="submit" value="Create VM now!"/>
			</p>
			</form>


			<#if (result??)>
			<p class="ok">
			${result}
			</p>
			<p>You can also create a new VM <a href="vmname.html">starting again</a> </p>
			</#if>



			
			
			<!-- Column 1 end -->
		</div>
		<div class="col2">
			<#include "sidebar.ftl">
		</div>
	</div>
</div>
<#include "../common/footer.html" parse=false>

