LIFERAY 7 - TUTORIALS
https://www.youtube.com/watch?v=QzGSAsYnFYM&list=PL_WCPOWW_gJFx8atHLNCGmOc6iVbnxv7E
01.Installation of Liferay 7 {
	Download:	https://www.liferay.com/downloads
}
02.Introduction of Liferay 7 {
	localhost:8080
	Configure page
	Add
		Add Calendar Portlet to new page
		Add LanguageSelector Portlet to new page
	Simulation
	Menu
		Add Public Page: liferayiseasy
	Portlet:
		Remove portlet
}
03.Create your First Portlet in Liferay 7 {
	New -> Liferay Module Project
		Portlet: 	Name: hello
				Component Class Name: Demo
				Package Name: com.demo
			init.jsp
			view.jsp
			build, copy to liferay-portal/deploy
	Add new portlet into a page
			
}
4.Apache Felix GoGo Shell Commands in Liferay7 {
	telnet localhost 11311
	lb
}
5.Apache Felix Gogo Shell Commands for Out of the box Portlets {
	lb bookmark -> list all modules containing 'bookmark'
	stop { moduleID}
}
6.How to resolve Dependency in Gradle {
	- dependency: org.osgi:org.osgi.core:5.0.0
	- activator:
		HelloActivator implements BundleActivator  {
			public void start(BundleContext) 
			public void stop(BundleContext)
		}
	- bundle: bnd.bnd <- HelloActivator	
}
7.How to Create Liferay 7.0 Bundle using Liferay Workspace {
	- New: Liferay Workspace: LiferayWork
		- New: Liferay Module: FirstWithLWS
			DemoPortlet	
}
8.How to Create Service Builder in Liferay 7 {
	- New: Liferay Module
		Project Template: servicebuilder
	
	  ->  service-api, service-service
	
		service.xml: {
			<service-builder package-path="com.employee">
				<namespace>Aditya</namespace>
				<entity>
					<column/>
					<column/>
				<entity>
			</service-builder>
		}
		
		buildService
		deployService
}

