package spring; 

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class Car { 
 
    private String carName = "Subaru"; 
 
    private String carModel = "WRX concept"; 
   
    @Autowired
    private Motorcycle motorcycle;

	public Motorcycle getMotorcycle(){
		return motorcycle;
	}

	public void setMotorcycle(Motorcycle motorcycle){
		this.motorcycle = motorcycle;
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


 
} 