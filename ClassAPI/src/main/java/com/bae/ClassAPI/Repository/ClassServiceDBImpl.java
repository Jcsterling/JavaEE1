package com.bae.ClassAPI.Repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.bae.ClassAPI.Domain.Classroom;
import com.bae.ClassAPI.util.JSONUtil;




@Transactional(SUPPORTS)
@Default
public class ClassServiceDBImpl implements ClassRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil jsonutil;
	
	public String getAllClassrooms() {
		
		TypedQuery<Classroom> query = em.createQuery("SELECT m FROM Account m", Classroom.class);
		
//		Query query = em.createQuery("SELECT m FROM ACCOUNT m", Account.class);
//		List<Account> accounts = (List<Account>) query.getResultList();
//		String jsonaccount = jsonutil.getJSONForObject(accounts);
		return jsonutil.getJSONForObject(query.getResultList());
	}


	@Transactional(REQUIRED)
	public String createClassroom(String account) {
		Classroom objectAccount = jsonutil.getObjectForJSON(account, Classroom.class);
		em.persist(objectAccount);
		return "{\"message\": \"CLASSROOM sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(Long id) {
		Classroom classToDelete = em.find(Classroom.class, id);
		if (classToDelete != null) {
			em.remove(classToDelete);
		}
		
		return "{\"message\": \"class sucessfully deleted\"}";
	}

	@Transactional(REQUIRED)
	public String updateClassroom(Long id, String classroom) {
		Classroom classToDelete = em.find(Classroom.class, id);
		if (classToDelete != null) {
			em.remove(classToDelete);
			Classroom objectAccount = jsonutil.getObjectForJSON(classroom, Classroom.class);
			em.persist(objectAccount);
		}
		
		return "{\"message\": \"class sucessfully updated\"}";
	}


	



	




}