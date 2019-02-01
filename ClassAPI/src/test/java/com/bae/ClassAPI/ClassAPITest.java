package com.bae.ClassAPI;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bae.persistence.domain.Classroom;
import com.bae.persistence.domain.Trainee;
import com.bae.persitence.repository.ClassroomMap;
import com.bae.util.JSONUtil;

import antlr.Utils;

public class ClassAPITest {
	

	private JSONUtil jsonutil;
	private ClassroomMap ClassService; 
	
	@Before
	public void setup() {

		jsonutil = new JSONUtil();
		ClassService = new ClassroomMap();
	}

	
	//Used TDD to create domain classes
	@Test
	public void testClassroom() {
		Classroom testClassroom1 = new Classroom();
		assertEquals(1, testClassroom1.getClassroomID());
		assertEquals("jamerson", testClassroom1.getTrainer());
		
	}
	
	@Test
	public void testTrainee() {
		Trainee testTrainee1 = new Trainee();
		assertEquals(1, testTrainee1.getTraineeID());
		assertEquals("jimbo", testTrainee1.getTraineeName());
	}
	
	
	@Test
	public void addClassTest() {
		
		
		//Started to use TDD to create map classes 

		Classroom testClassroom2 = new Classroom(12, "Mark");
		Trainee testTrainee1 = new Trainee(14,"jimmy");

		String jsonClassroom = jsonutil.getJSONForObject(testClassroom2);
		ClassService.createClassroom(jsonClassroom);
		
		assertEquals(1, ClassService.getClassMap().size());
//		assertEquals("jimmy", ClassService.getClassMap().get(testTrainee1).getTrainee().iterator().next().getTraineeName());
	}





}
