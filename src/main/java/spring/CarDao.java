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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public class CarDao implements CarDaoImpl {

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

	public Car findById(Integer id) {
		currentSession = getSessionFactory().openSession();
        	Car car = (Car) getCurrentSession().get(Car.class, id);
		currentSession.close();
        	return car;
    	}

	public List<Car> findAll() {
		currentSession = getSessionFactory().openSession();
        	List<Car> cars = (List<Car>) getCurrentSession().createQuery("from Car").list();
		currentSession.close();
        	return cars;
    	}

	public void update(Car entity) {
		currentSession = getSessionFactory().openSession();
		Transaction currentTransaction = getCurrentSession().beginTransaction();
        	getCurrentSession().update(entity);
		currentTransaction.commit();
		currentSession.close();
    	}

	public void delete(Car entity) {
		currentSession = getSessionFactory().openSession();
		Transaction currentTransaction = getCurrentSession().beginTransaction();
        	getCurrentSession().delete(entity);
		currentTransaction.commit();
		currentSession.close();
    	}
}

