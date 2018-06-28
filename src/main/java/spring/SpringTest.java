package spring;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

public class SpringTest	{

	public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext("spring");

	Car car = context.getBean(Car.class);
	Motorcycle moto = (Motorcycle) context.getBean("motorcycle");
	//Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

	System.out.println(car.getCarName());
	System.out.println(car.getCarModel());
	System.out.println(moto.getMotorcycleName());
	System.out.println(moto.getMotorcycleModel());
	}

}