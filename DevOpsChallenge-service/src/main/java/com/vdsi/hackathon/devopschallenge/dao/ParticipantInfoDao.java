package com.vdsi.hackathon.devopschallenge.dao;

import java.util.List;

import com.vdsi.hackathon.devopschallenge.model.Participant;

public interface ParticipantInfoDao {
	List<Participant> getParticipants();
	Participant getParticipantInfo(String vzId);
}
