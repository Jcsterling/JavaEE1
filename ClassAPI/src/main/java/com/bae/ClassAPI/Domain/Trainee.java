package com.bae.ClassAPI.Domain;


public class Trainee {

	private Long  Id;
	private int traineeID;
	private String traineeName;
	
	
	public Trainee() {
		
		setTraineeID(1);
		setTraineeName("jimbo");
	}
	
	public Trainee(int traineeID, String traineeName ) {
		
		setTraineeID(traineeID);
		setTraineeName(traineeName);
	}


	public int getTraineeID() {
		return traineeID;
	}


	public void setTraineeID(int traineeID) {
		this.traineeID = traineeID;
	}


	public String getTraineeName() {
		return traineeName;
	}


	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	

}
