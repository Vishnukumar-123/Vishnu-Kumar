# Vishnu-Kumar
import java.util.Scanner;

public class CompareTwonumber {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner sc = new Scanner(System.in)) {
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println(a);
        }
        else if((b>a)&&(b>c))
        {
            System.out.println(b)
        }
        else
        {
            System.out.println(c);
        }
      }
   }
} 
