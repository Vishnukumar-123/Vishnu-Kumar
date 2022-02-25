package hourconversion;
import java.util.Scanner;
public class hoursintodaysandyears {

	public static void main(String[] args) {
		double hoursInYear = 24 * 365;

        Scanner b = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double hrs = b.nextDouble();

        long years = (long) (hrs / hoursInYear);
        int days = (int) (hrs / 24) % 365;

        System.out.println((int) hrs + " hours " + years + " years and " + days + " days");
	} 

}
