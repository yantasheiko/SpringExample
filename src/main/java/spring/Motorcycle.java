package spring; 

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

public class Motorcycle {

    private Integer id;
 
    private String motorcycleName; 
 
    private String motorcycleModel;

	public Motorcycle() {
	}


	public Motorcycle(String motorcycleName, String motorcycleModel, int id) {
		this.motorcycleName = motorcycleName;
		this.motorcycleModel = motorcycleModel;
		this.id = id;
	}

	public Integer getId() {

		return id;

	}


	public void setId(int id) {

		this.id = id;

	}


	public String getMotorcycleName() {

		return motorcycleName;

	}


	public void setMotorcycleName(String motorcycleName) {

		this.motorcycleName = motorcycleName;

	}



	public String getMotorcycleModel() {

		return motorcycleModel;

	}


	public void setMotorcycleModel(String motorcycleModel) {

		this.motorcycleModel = motorcycleModel;

	}



	public String toString(){
		return "Motorcycle Name: " + this.motorcycleName +" Motorcycle Model: " + this.motorcycleModel;
	}
 
} 