package assignment25022022;
import java.util.*;
public class pantstylestarpattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int a,b, c, d = scan.nextInt();
        for(a = 0; a<d; a++)
        {
            for(c = d; c>a; c--)
                System.out.print("* ");
            for(b = 1; b<=4*a;b++)
            	System.out.print(" ");
            for(c = a+1 ; c<=d; c++)
                System.out.print("* ");
            System.out.println();
        }
	}

}
