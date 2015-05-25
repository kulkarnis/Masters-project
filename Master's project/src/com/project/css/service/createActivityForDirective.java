package com.project.css.service;


import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.project.css.entity.Activity;

public class createActivityForDirective {
	
	public static void main (String [] args)
	{
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Masters_project_css");
		
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Activity activity = new Activity();
		activity.setId(1);
		activity.setName(new java.sql.Date(new Date().getTime()));
		
		entitymanager.persist(activity);
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		emfactory.close();
	}
}
