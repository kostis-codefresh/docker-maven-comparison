<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>Hard disk Selection</h2>
			<form method="post" action="hd.html">
			
			<p>Configure hard disks</p>
			<p>Disk 1:  <select name="disk1">
  <option <#if disk1 = "100"> selected='selected' </#if> value="100">100MB (small)</option>
  <option <#if disk1 = "500"> selected='selected' </#if> value="500">500MB (medium)</option>
  <option <#if disk1 = "1000"> selected='selected' </#if> value="1000">1TB (large)</option>
</select>
			</p>
			
			<p>Disk 2:  <select name="disk2">
 <option <#if disk2 = "100"> selected='selected' </#if> value="100">100MB (small)</option>
  <option <#if disk2 = "500"> selected='selected' </#if> value="500">500MB (medium)</option>
  <option <#if disk2 = "1000"> selected='selected' </#if> value="1000">1TB (large)</option>
</select>
			</p>
			
			<p>
			<a href="memory.html">&lt; Previous step</a> |		<input type="submit" value="Next step &gt;"/>
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

