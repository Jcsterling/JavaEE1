package com.bae.ClassAPI.Repository;

public interface TraineeRepository {
	
	String getAllClassrooms();
	String createAccount(String trainee);
	String deleteClassroom(int id);
	String updateClassrom(int id, String trainee);


}
