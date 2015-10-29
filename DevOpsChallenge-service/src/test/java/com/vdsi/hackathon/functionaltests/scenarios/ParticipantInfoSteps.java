package com.vdsi.hackathon.functionaltests.scenarios;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vdsi.hackathon.devopschallenge.model.Participant;

import org.junit.Assert;

public class ParticipantInfoSteps {
	Client client = null;
	ClientResponse response = null;
	Participant participant = null;
	@Given("a running application")
	public void checkService(){
		client = Client.create();
		WebResource webResource = client
	    		   .resource("http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipants");
		response = webResource.accept("application/json")
                .get(ClientResponse.class);
		Assert.assertEquals(MediaType.APPLICATION_JSON, response.getType().toString());
		
	}
	
	@When("participant info is requested for $vzId")
	public void getParticipants(String vzId) throws InterruptedException{
		WebResource webResource = client.resource("http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipantInfo/"+vzId);
		response = webResource.accept("application/json")
             .get(ClientResponse.class);
		System.out.println("sleeping...");
		Thread.sleep(2000);
		String output = response.getEntity(String.class);
		Gson gson = new Gson();
		participant = gson.fromJson(output, Participant.class);
		Assert.assertNotNull(participant);
	}
	
	@Then("the teamname of participant is $teamName")
	public void assertParticipants(String teamName){
		Assert.assertEquals(participant.getTeamName(), teamName);
	}
}
