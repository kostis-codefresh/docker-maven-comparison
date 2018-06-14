
package com.codepipes.wizard;

import groovyx.net.http.RESTClient
import spock.lang.*

/**
 * Trivial homepage test. Just verifies that the application is running.
 * 
 * @author Kostis
 *
 */
 class HomePageSpec extends Specification {



 	@Shared
 	def client

 	def setupSpec() {
 		Integer port = 8080
 		String actualPort = System.getProperty("server.port")

 		if (actualPort != null) {
 			port = Integer.valueOf(actualPort)
 		}

 		String basePath = "/wizard/"
 		String actualBasePath = System.getProperty("server.base")

 		if(actualBasePath != null){
 			basePath = actualBasePath
 		}

 		String baseHost = "localhost"
 		String actualHost = System.getProperty("server.host")

 		if(actualHost != null){
 			baseHost = actualHost
 		}


 		client = new RESTClient("http://" + baseHost + ":" + port + basePath)
 	}  

 	def "Homepage exists"() {
 		when: "a rest call is performed to the main page"
 		def response = client.get(path : "index.html")

 		then: "the correct message is expected"
 		with(response) {
 			status == 200
 		}
 	}

 	def "About Page exists"() {
 		when: "a rest call is performed to the about page"
 		def response = client.get(path : "about.html")

 		then: "the correct message is expected"
 		with(response) {
 			status == 200
 		}
 	}


 }
