<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>Memory size</h2>
			<form method="post" action="memory.html">
			
			<#if (errors??)>
			<p class="error">
			${errors}
			</p>
			</#if>
			
			<p>Enter the size of memory in MBs (min 256, max 16384)</p>
			Name: <input size="7" name="megabytes" value="${megabytes}" /> 
			</p>
			
			<p>
			<a href="cpu.html">&lt; Previous step</a> |	<input type="submit" value="Next step &gt;"/>
			</p>
			</form>




			
			
			<!-- Column 1 end -->
		</div>
		<div class="col2">
			<#include "sidebar.ftl">
		</div>
	</div>
</div>
<#include "../common/footer.html" parse=false>

