package conversionunit;
import java.util.Scanner;
public class inchesintometersconversion {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Input Value for inch: ");
		double inch=a.nextDouble();
		double meter=inch*0.0254;
		System.out.println(inch + "Inch is" + meter + "meters");

	}

}
