package com.bae.ClassAPI.Repository;

import java.util.HashMap;
import java.util.Map;

import com.bae.ClassAPI.Domain.Classroom;
import com.bae.ClassAPI.util.JSONUtil;


public class ClassroomMap implements ClassRepository {
	
	JSONUtil jsonutil = new JSONUtil();
	private Map<Long, Classroom> classMap = new HashMap<>();
	private Long newID = 0L;

	public ClassroomMap() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getAllClassrooms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createClassroom(String classroom) {
		Classroom jsonclassroom = jsonutil.getObjectForJSON(classroom, Classroom.class);
		classMap.put(newID, jsonclassroom);
		newID++;
		return "yes";
	}

	@Override
	public String deleteClassroom(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateClassroom(Long id, String classrooom) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<Long, Classroom> getClassMap() {
		return classMap;
	}

	public void setClassMap(Map<Long, Classroom> classMap) {
		this.classMap = classMap;
	}

	
}
