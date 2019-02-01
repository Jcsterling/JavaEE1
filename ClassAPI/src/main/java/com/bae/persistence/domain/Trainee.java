package com.bae.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Trainee {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
