package com.bae.persitence.repository;

public interface TraineeRepository {
	
	String getAllTrainees();
	String createTrainee(String trainee);
	String deleteTrainee(Long id);
	String updateTrainee(Long id, String trainee);


}
