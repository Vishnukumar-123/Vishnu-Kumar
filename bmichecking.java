package bmi;
import java.util.*;
public class bmichecking {

	public static void main(String[] args) {
		 Scanner a = new Scanner(System.in);

	        System.out.print("Input weight in pounds: ");
	        double weight = a.nextDouble();

	        System.out.print("Input height in inches: ");
	        double inches = a.nextDouble();

	        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
	        System.out.print("Body Mass Index is " + BMI+"\n");

	}

}
