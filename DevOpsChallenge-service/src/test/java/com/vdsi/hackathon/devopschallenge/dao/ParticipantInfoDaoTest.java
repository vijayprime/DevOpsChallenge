package com.vdsi.hackathon.devopschallenge.dao;

import java.io.File;
import java.util.List;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.vdsi.hackathon.devopschallenge.base.BasePersistenceTest;
import com.vdsi.hackathon.devopschallenge.model.Participant;

public class ParticipantInfoDaoTest extends BasePersistenceTest{
	
	@Autowired
	private ParticipantInfoDaoImpl participantInfoDao;
	
	@Autowired
	private DataSource datasource;
	
	@Before
	public void setUp() throws Exception{
			DatabaseOperation.CLEAN_INSERT.execute(getConnection(), getDataSet());
	}
	
	@Test
	public void testGetParticipants(){
		List<Participant> participants = participantInfoDao.getParticipants();
		Assert.assertNotNull(participants);
		Assert.assertEquals(1, participants.size());
	}
	
	@Test
	public void testGetParticipantInfo(){
		Participant participant = participantInfoDao.getParticipantInfo("v646876");
		Assert.assertNotNull(participant);
		Assert.assertEquals("vignesh", participant.getFirstName());
		Assert.assertEquals("murugan", participant.getLastName());
		Assert.assertEquals("veg", participant.getFoodPref());
		Assert.assertEquals("p05", participant.getChallengeId());
		Assert.assertEquals("techknights", participant.getTeamName());
	}

	@Override
	protected IDatabaseConnection getConnection() throws Exception {
		return new DatabaseConnection(datasource.getConnection());
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		return new FlatXmlDataSetBuilder().build(new File("src/test/resources/testdatasets/participant-dataset.xml"));
	}
}
