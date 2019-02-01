package com.bae.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.bae.business.ClassService;


@Path("/Classroom")
public class ClassRoomController {


	@Inject
	private ClassService service;
	
	
	@Path("/getAllClasses")
	@GET
	@Produces({ "application/json" })
	public String getAllClasses() {
		return service.getAllClassrooms();
	}

	@Path("/createClass")
	@POST
	@Produces({ "application/json" })
	public String addClass(String classroom) {
		return service.createClassroom(classroom);
	}

	@Path("/deleteClass/{id}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteClass(@PathParam("id") Long id) {
		return service.deleteClassroom(id);
	}
	
	@Path("/updateClass/{id}")
	@PUT
//	@Produces({ "application/json" })
	public String updateClass(@PathParam("id") Long id,  String classroom) {
		return service.updateClassroom(id, classroom);
	}
	
	public void setService(ClassService service) {
		this.service = service;
	}
	
}
	