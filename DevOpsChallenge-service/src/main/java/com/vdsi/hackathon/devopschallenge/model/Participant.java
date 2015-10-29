package com.vdsi.hackathon.devopschallenge.model;

public class Participant {
	private String vzId;
	private String firstName;
	private String lastName;
	private String empId;
	private String teamName;
	private String portfolio;
	private String platform;
	private String mobileNo;
	private String challengeId;
	private String foodPref;
	
	public String getVzId() {
		return vzId;
	}
	public void setVzId(String vzId) {
		this.vzId = vzId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getFoodPref() {
		return foodPref;
	}
	public void setFoodPref(String foodPref) {
		this.foodPref = foodPref;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getChallengeId() {
		return challengeId;
	}
	public void setChallengeId(String challengeId) {
		this.challengeId = challengeId;
	}
}
