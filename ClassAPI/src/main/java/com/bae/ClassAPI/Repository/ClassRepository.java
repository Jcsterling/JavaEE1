package com.bae.ClassAPI.Repository;

public interface ClassRepository {
	

	String getAllClassrooms();
	String createClassroom(String classroom);
	String deleteClassroom(Long id);
	String updateClassroom(Long id, String classrooom);

}
