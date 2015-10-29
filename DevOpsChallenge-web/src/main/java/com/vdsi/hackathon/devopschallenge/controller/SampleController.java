package com.vdsi.hackathon.devopschallenge.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vdsi.hackathon.devopschallenge.model.Participant;
import com.vdsi.hackathon.devopschallenge.model.SampleResponse;
import com.vdsi.hackathon.devopschallenge.service.SampleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/hello/{message}", method = RequestMethod.GET)
    public @ResponseBody SampleResponse sayHello(@PathVariable String message) {
        return sampleService.sayHello(message);
    }
    
    public void getParticipantsList() {
    	try {

    		Client client = Client.create();

    		WebResource webResource = client
    		   .resource("http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipantInfo/v646876");

    		ClientResponse response = webResource.accept("application/json")
                       .get(ClientResponse.class);

    		if (response.getStatus() != 200) {
    		   throw new RuntimeException("Failed : HTTP error code : "
    			+ response.getStatus());
    		}

    		Participant output = response.getEntity(Participant.class);

    		System.out.println("Output from Server .... \n");
    		System.out.println(output.getFirstName());

    	  } catch (Exception e) {

    		e.printStackTrace();

    	  }
	}
}
