package com.bae.persitence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.bae.persistence.domain.Classroom;
import com.bae.persistence.domain.Trainee;
import com.bae.util.JSONUtil;

@Alternative
public class ClassroomMap   {
	
	JSONUtil jsonutil = new JSONUtil();
	private Map<Long, Classroom> classMap = new HashMap<>();
	
	private Long newID = 0L;

	public ClassroomMap() {
	}

	
	public String getAllClassrooms() {
		return null;
	}
	
	public String createClassroom(String classroom) {
		Classroom jsonclassroom = jsonutil.getObjectForJSON(classroom, Classroom.class);
		classMap.put(newID, jsonclassroom);
		newID++;
		return "yes";
	}

	
	public String deleteClassroom(Long id) {
		return null;
	}

	
	public String updateClassroom(Long id, String classrooom) {
		return null;
	}

	public Map<Long, Classroom> getClassMap() {
		return classMap;
	}

	public void setClassMap(Map<Long, Classroom> classMap) {
		this.classMap = classMap;
	}

	

	
}
