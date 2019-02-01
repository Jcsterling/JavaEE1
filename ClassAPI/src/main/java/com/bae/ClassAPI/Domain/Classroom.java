package com.bae.ClassAPI.Domain;



public class Classroom {

	private int classroomID;
	private String trainer;
	
	
	
	public Classroom() {
		
		classroomID = 1;
		trainer = "jamerson";
		
	}
	
	
	public Classroom(int classroomID , String trainer) {
		setClassroomID(classroomID);
		setTrainer(trainer);
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
