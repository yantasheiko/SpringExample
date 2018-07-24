package spring;

import spring.*;

import java.sql.*;
import java.util.*;
import java.io.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MotorcycleDao implements MotorcycleDaoImpl {

	private Session currentSession;
	private static SessionFactory sessionFactory;

	private static SessionFactory getSessionFactory() {
        	return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
        	this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
       		return currentSession;
	}
 
	public void setCurrentSession(Session currentSession) {
        	this.currentSession = currentSession;
	}

	public Motorcycle findById(Integer id) {
		currentSession = getSessionFactory().openSession();
        	Motorcycle moto = (Motorcycle) getCurrentSession().get(Motorcycle.class, id);
		currentSession.close();
        	return moto;
    	}

	public List<Motorcycle> findAll() {
		currentSession = getSessionFactory().openSession();
        	List<Motorcycle> motorcycles = (List<Motorcycle>) getCurrentSession().createQuery("from Motorcycle").list();
		currentSession.close();
        	return motorcycles;
    	}

	public void update(Motorcycle entity) {
		currentSession = getSessionFactory().openSession();
		Transaction currentTransaction = getCurrentSession().beginTransaction();
        	getCurrentSession().update(entity);
		currentTransaction.commit();
		currentSession.close();
    	}

	public void delete(Motorcycle entity) {
		currentSession = getSessionFactory().openSession();
		Transaction currentTransaction = getCurrentSession().beginTransaction();
        	getCurrentSession().delete(entity);
		currentTransaction.commit();
		currentSession.close();
    	}

}
