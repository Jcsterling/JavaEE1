package com.bae.ClassAPI.business;

import javax.inject.Inject;

import com.bae.ClassAPI.Repository.ClassRepository;
import com.bae.ClassAPI.util.JSONUtil;



public class ClassServiceImpl implements ClassService {
	
	@Inject
	private JSONUtil jsonutil;

	@Inject
	private ClassRepository repository;

	
	public String getAllClassrooms() {
		
		return repository.getAllClassrooms();
	}

	
	public String createClassroom(String classroom) {
		
		return repository.createClassroom(classroom);
	}

	
	public String deleteClassroom(Long id) {
		
		return repository.deleteClassroom(id);
	}

	
	public String updateClassroom(Long id, String classrooom) {
	
		
		return repository.updateClassroom(id, classrooom);
	}

}
