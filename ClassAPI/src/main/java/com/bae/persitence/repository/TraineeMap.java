package com.bae.persitence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;

import com.bae.persistence.domain.Classroom;
import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Default
public class TraineeMap implements TraineeRepository {
	
	JSONUtil jsonutil = new JSONUtil();
	Classroom classroom = new Classroom();
	ClassroomMap classroomap = new ClassroomMap();
	private Map<ClassroomMap, Trainee> traineeMap = new HashMap<>();


	public String getAllTrainees() {
		return null;
	}

	
	public String createTrainee(String trainee) {
		Trainee jsontrainee = jsonutil.getObjectForJSON(trainee, Trainee.class);
//		traineeMap.put(classroomap.getClassMap().get(key).getClassroomID(), jsontrainee);
		
		return "trainee created"; 
	}

	
	public String deleteTrainee(Long id) {
		return null;
	}

	
	public String updateTrainee(Long id, String Trainee) {
		return null;
	}

}
