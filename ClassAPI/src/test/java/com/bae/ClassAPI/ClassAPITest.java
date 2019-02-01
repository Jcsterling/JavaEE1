package com.bae.ClassAPI;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.bae.ClassAPI.Domain.Classroom;
import com.bae.ClassAPI.Domain.Trainee;
import com.bae.ClassAPI.util.JSONUtil;

public class ClassAPITest {
	

	private JSONUtil jsonutil;
	
	@Before
	public void setup() {

		jsonutil = new JSONUtil();
	}

	
	
	
	
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
	
	




}
