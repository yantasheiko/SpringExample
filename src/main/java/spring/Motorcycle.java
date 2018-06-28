package spring; 

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.*;

@Component
public class Motorcycle { 
 
    private String motorcycleName = "Yamaha"; 
 
    private String motorcycleModel = "YZF-R1S"; 

	@Bean
	public String getMotorcycleName() {

		return motorcycleName;

	}


	public void setMotorcycleName(String motorcylceName) {

		this.motorcycleName = motorcycleName;

	}



	@Bean
	public String getMotorcycleModel() {

		return motorcycleModel;

	}


	public void setMotorcylceModel(String motorcycleModel) {

		this.motorcycleModel = motorcycleModel;

	}


 
} 