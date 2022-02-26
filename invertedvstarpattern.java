package assignment25022022;
import java.util.*;
public class invertedvstarpattern {

	public static void main(String[] args) {
		int r,s=0, c, rows;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        rows = scan.nextInt();
        for(r = rows-1; r>= 0; r--)
        {
            for(c = rows-1;c>s;c--)
                System.out.print(" ");
            System.out.print("*");
            for(c=1;c<(s*2);c++)
                System.out.print(" ");
            if(r<rows-1)
                System.out.print("*");
            s++;
            System.out.println();
        }

	}

}
