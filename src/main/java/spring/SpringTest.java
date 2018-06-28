package spring;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class SpringTest	{

	public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext("spring");

	Car car = context.getBean(Car.class);

	System.out.println(car.getCarName());
	System.out.println(car.getCarModel());
	System.out.println(car.getMotorcycle().getMotorcycleName());
	System.out.println(car.getMotorcycle().getMotorcycleModel());
	}

}