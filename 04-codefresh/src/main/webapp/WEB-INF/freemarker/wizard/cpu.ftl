<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>Number of CPUs Selection</h2>
			<form method="post" action="cpu.html">
			
			<p>Select number of CPUs</p>
			<p>Number of processors:  <select name="processors">
  <option <#if processors = "1"> selected='selected' </#if> value="1">1</option>
  <option <#if processors = "2"> selected='selected' </#if> value="2">2</option>
  <option <#if processors = "4"> selected='selected' </#if> value="4">4</option>
  <option <#if processors = "8"> selected='selected' </#if> value="8">8</option>
</select>
			</p>
			
			<p>
			<a href="os.html">&lt; Previous step</a> |		<input type="submit" value="Next step &gt;"/>
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

