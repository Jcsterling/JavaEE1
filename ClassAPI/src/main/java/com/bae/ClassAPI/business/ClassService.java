package com.bae.ClassAPI.business;

public interface ClassService {
	String getAllClassrooms();
	String createClassroom(String classroom);
	String deleteClassroom(Long id);
	String updateClassroom(Long id, String classrooom);

}
