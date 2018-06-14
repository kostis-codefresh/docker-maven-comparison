<div id="header">
	<h1>Simple Web Wizard in Spring MVC</h1>
	<h2>Virtual machine Wizard creator</h2>
	<ul>
		<li><a href="index.html" <#if selectedTab = 'welcome'> class='active' </#if>>Welcome</span></a></li>
		<li><a href="vmname.html" <#if selectedTab = 'steps'> class='active' </#if>>Wizard</a></li>
		<li><a href="about.html" <#if selectedTab = 'about'> class='active' </#if>>Technology</a></li>
	</ul>
	<p id="layoutdims">Current page: <strong>${pageName}</strong></p>
</div>

