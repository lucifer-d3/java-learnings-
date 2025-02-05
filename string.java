import java.util.Scanner; 
public class string {
    public static void main(String[] args){
      //  String name = new String("parth");
      String name= new String("Parth bhatia");
        System.out.println(name);
        System.out.println("the name is:");
        int a =6;
        float b= 12.4f;
        System.out.printf("the value of a is %d and value of b is %f", a,b);
        Scanner sc= new Scanner(System.in);
        String st = sc.next();
        // String st = sc.nextLine();
        System.out.println(st);
        sc.close();
    }
}
