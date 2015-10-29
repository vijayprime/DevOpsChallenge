package com.idodevjobs.sample.action;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.vdsi.hackathon.devopschallenge.model.Participant;

public class ParticipantsInfoAction {
	
	private Participant participant;

	public String execute() {
		Client client = new Client();
		WebResource webResource = client.resource(
				"http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipantInfo/v646876");

		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		String output = response.getEntity(String.class);
		Gson gson = new Gson();
		Participant participant = gson.fromJson(output, Participant.class);
		System.out.println(participant);
		this.setParticipant(participant);
		return "success";
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		WebResource webResource = client.resource(
				"http://localhost:8180/DevOpsChallenge-service/rest/participantInfo/getparticipantInfo/v646876");

		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

		String output = response.getEntity(String.class);
		Gson gson = new Gson();
		Participant participant = gson.fromJson(output, Participant.class);
		System.out.println(participant.getChallengeId());
	}
	
	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
}
