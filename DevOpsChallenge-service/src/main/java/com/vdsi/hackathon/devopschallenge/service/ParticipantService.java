package com.vdsi.hackathon.devopschallenge.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vdsi.hackathon.devopschallenge.dao.ParticipantInfoDao;
import com.vdsi.hackathon.devopschallenge.model.Participant;

@Path("/participantInfo")
public class ParticipantService {
	
	private ParticipantInfoDao participantInfoDao;
	
	@GET
	@Path("/getparticipants")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Participant> getParticipants() {
		List<Participant> participants = participantInfoDao.getParticipants();
		return participants;
	}
	
	@GET
	@Path("/getparticipantInfo/{vzId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Participant getParticipantInfo(@PathParam("vzId") String vzId) {
		System.out.println("****"+vzId);
		Participant participant = participantInfoDao.getParticipantInfo(vzId);
		return participant;
	}

	public void setParticipantInfoDao(ParticipantInfoDao participantInfoDao) {
		this.participantInfoDao = participantInfoDao;
	}
	
}
