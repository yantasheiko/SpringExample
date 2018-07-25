package spring.dto; 

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;


public class Car { 

    private Integer id;
 
    private String carName; 
 
    private String carModel; 
   
    //private Motorcycle motorcycle;

	public Car() {
	}


	public Car(String carName, String carModel, int id) {
		this.carName = carName;
		this.carModel = carModel;
		this.id = id;
	}	

	//public Motorcycle getMotorcycle(){
	//	return motorcycle;
	//}

	//public void setMotorcycle(Motorcycle motorcycle){
	//	this.motorcycle = motorcycle;
	//}


	public Integer getId() {

		return id;

	}


	public void setId(int id) {

		this.id = id;

	}


	public String getCarName() {

		return carName;

	}


	public void setCarName(String carName) {

		this.carName = carName;

	}



	public String getCarModel() {

		return carModel;

	}


	public void setCarModel(String carModel) {

		this.carModel = carModel;

	}


 
	public String toString(){
		return "Car Name: " + this.carName +" Car Model: " + this.carModel;
	}

} 