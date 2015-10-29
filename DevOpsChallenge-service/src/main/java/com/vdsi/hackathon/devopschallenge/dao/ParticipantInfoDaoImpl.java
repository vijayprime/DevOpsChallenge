package com.vdsi.hackathon.devopschallenge.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.vdsi.hackathon.devopschallenge.model.Participant;

public class ParticipantInfoDaoImpl implements ParticipantInfoDao {
	
	private DataSource dataSource;

	public List<Participant> getParticipants(){
		List<Participant> participants = null;
		try {
			Connection con = dataSource.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select vzid,firstname,lastname,empid,teamname,portfolio,platform,mobileno,challengeid,foodpref from participant");
			participants= readParticipantList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return participants;
	}
	
	public Participant getParticipantInfo(String vzId){
		Participant participant = null;
		try {
			Connection con = dataSource.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select vzid,firstname,lastname,empid,teamname,portfolio,platform,mobileno,challengeid,foodpref from participant where vzid='"+vzId+"'");
			participant= readParticipantInfo(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return participant;
	}

	private Participant readParticipantInfo(ResultSet rs) throws SQLException {
		Participant participant = new Participant();
		if(rs.next()){
			participant.setVzId(rs.getString("vzid"));
			participant.setFirstName(rs.getString("firstname"));
			participant.setLastName(rs.getString("lastname"));
			participant.setEmpId(rs.getString("empid"));
			participant.setTeamName(rs.getString("teamname"));
			participant.setPortfolio(rs.getString("portfolio"));
			participant.setPlatform(rs.getString("platform"));
			participant.setMobileNo(rs.getString("mobileno"));
			participant.setChallengeId(rs.getString("challengeid"));
			participant.setFoodPref(rs.getString("foodpref"));
		}
		return participant;
	}

	private List<Participant> readParticipantList(ResultSet rs) throws SQLException {
		List<Participant> participants = new ArrayList<Participant>();
		while(rs.next()){
			Participant participant = new Participant();
			participant.setVzId(rs.getString("vzid"));
			participant.setFirstName(rs.getString("firstname"));
			participant.setLastName(rs.getString("lastname"));
			participant.setEmpId(rs.getString("empid"));
			participant.setTeamName(rs.getString("teamname"));
			participant.setPortfolio(rs.getString("portfolio"));
			participant.setPlatform(rs.getString("platform"));
			participant.setMobileNo(rs.getString("mobileno"));
			participant.setChallengeId(rs.getString("challengeid"));
			participant.setFoodPref(rs.getString("foodpref"));
			participants.add(participant);
		}
		return participants;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
