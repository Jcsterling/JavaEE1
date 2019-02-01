package com.bae.business;

import javax.enterprise.inject.Default;
import javax.inject.Inject;

import com.bae.persitence.repository.ClassRepository;
import com.bae.util.JSONUtil;


@Default
public class ClassServiceImpl implements ClassService {
	
	
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
