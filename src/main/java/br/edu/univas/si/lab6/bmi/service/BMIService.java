package br.edu.univas.si.lab6.bmi.service;

public class BMIService {
	
	private BMIService() {
		//To avoid a new instance of BMIService class
	}
	
	public static Float getIndex(Float weight, Float height) {
		return weight / (height * height);
	}
	
	public static String getDescription(Float bmiIndex) {
		String result;
		if(bmiIndex <17){
			result = "Muito abaixo do peso";
		}
		else if(bmiIndex <= 18.49){
			result = "Abaixo do peso";
		}
		else if(bmiIndex <= 24.99){
			result = "Peso normal";
		}
		else if(bmiIndex <= 29.99){
			result =  "Acima do peso";
		}
		else if(bmiIndex <= 34.99){
			result = "Obesidade I";
		}
		else if(bmiIndex <=39.99){
			result = "Obesidade II";
		}
		else{
			result = "Obesidade III";
		}
		
		return result;
	}

}