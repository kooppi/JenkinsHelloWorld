package com.kooppi.ci.jenkins.demo.helloworld.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("helloworld")
public class HelloWorldRes {

	//Get: http://localhost:8080/jenkins-helloworld/api/helloworld
	@GET
	public String getHelloworldMessage(){
		return "Hello World";
	}
}
