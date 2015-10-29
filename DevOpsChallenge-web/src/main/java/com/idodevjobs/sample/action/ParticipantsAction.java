package com.idodevjobs.sample.action;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vdsi.hackathon.devopschallenge.model.Participant;

public class ParticipantsAction{

	private List<Participant> participants;
	
	public String execute() {
		System.out.println("csdcsdvd");
		try {
    		Client client = Client.create();
    		WebResource webResource = client
    	    		   .resource("http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipants");
    		ClientResponse response = webResource.accept("application/json")
                    .get(ClientResponse.class);
    		String output = response.getEntity(String.class);
    		System.out.println(output);
    		Gson gson = new Gson();
    		List<Participant> participants = gson.fromJson(output, new TypeToken<List<Participant>>(){}.getType());
    		this.setParticipants(participants);
    		/* List<Participant> list = Client.create().resource("http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipants")
    	                .get(new GenericType<List<Participant>>(){});
    		 System.out.println(list.size());*/

    	  } catch (Exception e) {

    		e.printStackTrace();

    	  }
		return "success";
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Client client = Client.create();
		WebResource webResource = client
	    		   .resource("http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipants");
		ClientResponse response = webResource.accept("application/json")
                .get(ClientResponse.class);
		String output = response.getEntity(String.class);
		System.out.println(output);
		Gson gson = new Gson();
		List<Participant> logs = gson.fromJson(output, new TypeToken<List<Participant>>(){}.getType());
	 System.out.println(logs.size());
	}

	public List<Participant> getParticipants() {
		return participants;
	}

	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	
}
