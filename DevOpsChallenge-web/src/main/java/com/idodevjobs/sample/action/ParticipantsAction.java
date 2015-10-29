package com.idodevjobs.sample.action;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vdsi.hackathon.devopschallenge.model.Participant;

public class ParticipantsAction{

	public String execute() {
		System.out.println("csdcsdvd");
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
		return "success";
	}
	
}
