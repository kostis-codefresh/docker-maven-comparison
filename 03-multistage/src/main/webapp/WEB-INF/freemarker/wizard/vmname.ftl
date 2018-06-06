<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>Name of the VM</h2>
			<form method="post" action="vmname.html">
			
			<#if (errors??)>
			<p class="error">
			${errors}
			</p>
			</#if>
			
			<p>Enter the name of the Virtual machine that will be created</p>
			<p>Name: <input size="30" name="virtualmachinename" value="${virtualmachinename}" /> 
			</p>
			
			<p>
			<input type="submit" value="Next step &gt;"/>
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

