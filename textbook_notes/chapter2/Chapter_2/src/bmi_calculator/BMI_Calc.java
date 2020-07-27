package bmi_calculator;

public class BMI_Calc {

	public static void main(String[] args) {
	// declare variables
	double weight;
	double height;
	double bmi;
	
	// compute BMI
	height = 64;
	weight = 190;
	bmi = weight / (height * height) * 703;
	
	// print results
	System.out.println("Current BMI: ");
	System.out.print(bmi);

	}

}
