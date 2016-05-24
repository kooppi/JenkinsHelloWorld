package com.kooppi.ci.jenkins.demo.helloworld.rest.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class RestConfig extends ResourceConfig{

	public RestConfig(){
		packages(false,"com.kooppi.ci.jenkins.demo.helloworld.rest.resources");
	}
}
