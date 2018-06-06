
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
	def client = new RESTClient("http://localhost:8080/wizard/")

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
