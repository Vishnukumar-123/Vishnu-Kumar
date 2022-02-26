package assignment25022022;
import java.util.*;
public class halfdiamondpattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      int n = 0;
	      System.out.print("Enter N value:: ");
	      n = scan.nextInt();
	      printNumberHalfDiamond(n);
	   }

	   public static void printNumberHalfDiamond(int n) {
	      if(n <= 0)
	      System.out.println("Enter Positive Number");
	      int b = 0, a = 0;

	      for(int i=1; i < 2*n; i++) {
	         a = 1;

	         if(i < n) b = i;
	         else b = Math.abs(2*n-i);
	         for(int j = 1; j <= b; j++) {
	            System.out.print(" "+a++); 
	         }

	         
	         System.out.println();

	}
	   }
}
