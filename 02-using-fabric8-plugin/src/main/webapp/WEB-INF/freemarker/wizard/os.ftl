<#include "../common/header.html" parse=false>
<#include "../common/nav.ftl">

<div class="colmask leftmenu">
	<div class="colleft">
		<div class="col1">
			<!-- Column 1 start -->
			<h2>OS Selection</h2>
			<form method="post" action="os.html">
			
			<p>Select the Operating System</p>
			<p>OS:  <select name="selectedos">
  <option <#if selectedos = "WINDOWS_7"> selected='selected' </#if> value="WINDOWS_7">Windows 7 Ultimate</option>
  <option <#if selectedos = "WINDOWS_XP"> selected='selected' </#if> value="WINDOWS_XP">Windows XP SP3</option>
  <option <#if selectedos = "UBUNTU"> selected='selected' </#if> value="UBUNTU">Ubuntu LTS</option>
  <option <#if selectedos = "FEDORA"> selected='selected' </#if> value="FEDORA">Fedora Linux</option>
  <option <#if selectedos = "MACOSX"> selected='selected' </#if> value="MACOSX">Mac OS X</option>
</select>
			</p>
			
			<p>
			<a href="vmname.html">&lt; Previous step</a> |		<input type="submit" value="Next step &gt;"/>
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

