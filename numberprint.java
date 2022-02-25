package classtime;
import java.util.*;
public class numberprint {
	public static void main(String[] args) {
		int a, i, j, b = 1;  
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);  
		a = sc.nextInt();  
		b = a - 1;  
		for (j = 1; j<= a; j++)  
		{  
		for (i = 1; i<= b; i++)  
		{  
		System.out.print(" ");  
		}  
		b--;  
		for (i = 1; i <= 2 * j - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
		b = 1;  
		for (j = 1; j<= a - 1; j++)  
		{  
		for (i = 1; i<= b; i++)  
		{  
		System.out.print(" ");  
		}  
		b++;  
		for (i = 1; i<= 2 * (a - j) - 1; i++)  
		{  
		System.out.print("*");  
		}  
		System.out.println("");  
		}  
	}
}
		 

