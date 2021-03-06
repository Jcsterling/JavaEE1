package com.bae.ClassAPI.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Classroom {

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private int classroomID;
	private String trainer;
	
	 @LazyCollection(LazyCollectionOption.FALSE)
	    @OneToMany(cascade = CascadeType.ALL)
	    private List<Trainee> trainee;
	
	
	
	public Classroom() {
		
		classroomID = 1;
		trainer = "jamerson";
		
	}
	

	public Classroom(int classroomID , String trainer) {
		setClassroomID(classroomID);
		setTrainer(trainer);
		
	}
	
	
	public Classroom(int classroomID , String trainer, List<Trainee> trainee) {
		setClassroomID(classroomID);
		setTrainer(trainer);
		setTrainee(trainee);
	}
	
	
	
	public List<Trainee> getTrainee() {
		return trainee;
	}


	public void setTrainee(List<Trainee> trainee) {
		this.trainee = trainee;
	}


	public int getClassroomID() {
		return classroomID;
	}
	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}


	public String getTrainer() {
		return trainer;
	}



	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

}
