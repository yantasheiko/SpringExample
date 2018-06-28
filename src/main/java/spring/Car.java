package spring; 

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Component
public class Car { 
 
    private String carName = "Subaru"; 
 
    private String carModel = "WRX concept"; 

	@Bean
	public String getCarName() {

		return carName;

	}


	public void setCarName(String carName) {

		this.carName = carName;

	}



	@Bean
	public String getCarModel() {

		return carModel;

	}


	public void setCarModel(String carModel) {

		this.carModel = carModel;

	}


 
} 