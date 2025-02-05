
import java.util.Scanner;
public class operators{
    public static void  main(String[] args)
    {
        float a = 7f/4*9f/2;
        System.out.println(a);
        char grade = 'B';
        grade = (char)(grade +8);
        System.out.println(grade);
        grade = (char)(grade -8);
        System.out.println(grade);
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8 );
        sc.close();
        int v = 10;
    
        int s=1;
        int u=0;
        int i =((v*v)-(u*u))/(2*a*s);
        System.out.println(i);
        int x=7;
    
        System.out.println(x);
        System.out.println(a);



    }
}