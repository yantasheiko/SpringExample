package spring.mainclass;

import spring.dao.*;
import spring.dto.*;
import spring.services.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;
import java.io.*;
import java.util.*;

public class SpringTest	{

	public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	Car car = new Car();
	Motorcycle motorcycle = new Motorcycle();
	CarService carService = (CarService)context.getBean("carService");
	MotorcycleService motorcycleService = (MotorcycleService)context.getBean("motorcycleService");
	
	carService.findAll();
	motorcycleService.findAll();
		List<Car> listCar = carService.findAll();
	   	Iterator<Car> iterCar = listCar.iterator();
		System.out.println("List of cars");
         	for (int a = 0; iterCar.hasNext();) {
			car = iterCar.next();
			System.out.println(car.getCarName() + " - " + car.getCarModel()); 
            	}

		List<Motorcycle> listMoto = motorcycleService.findAll();
	   	Iterator<Motorcycle> i = listMoto.iterator();
		System.out.println("List of motorcycles");
         	for (int a = 0; i.hasNext();) {
			motorcycle = i.next();
			System.out.println(motorcycle.getMotorcycleName() + " - " + motorcycle.getMotorcycleModel()); 
            	}

		Car carUpd = new Car("BMW", "F02", 4);
		Motorcycle motoUpd = new Motorcycle("Kawasaki", "Concours", 3);
		carService.update(carUpd);
		motorcycleService.update(motoUpd);
    		System.out.println("Update list");
	System.out.println("Car at number: " + carUpd.getId() + " was updated in DB with following details: " + carUpd.getCarName() + " " + carUpd.getCarModel());
	System.out.println("----------------------");
	System.out.println("Motorcycle at number: " + motoUpd.getId() + " was updated in the DB with following details: " + motoUpd.getMotorcycleName() + " " + motoUpd.getMotorcycleModel()); 



    	System.out.println("Deletion list");
		Car carDel = new Car();
		Motorcycle motoDel = new Motorcycle();
		carDel.setId(5);
		motoDel.setId(6);
		carService.delete(carDel.getId());
		motorcycleService.delete(motoDel.getId());

	System.out.println("Car at number " + carDel.getId() + " was deleted from DB");
	System.out.println("----------------------");
	System.out.println("Motorcycle at number " + motoDel.getId() + " was deleted from DB");


	carService.close();
	motorcycleService.close();
	}

}