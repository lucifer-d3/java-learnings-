import java.util.Scanner;
public class sw{
    public void main(String[] args){
        int age ;
        System.out.println("enter your age");
        Scanner sc= new Scanner(System.in);
        age= sc.nextInt();
        switch(age){
            case 18:
            System.out.println("congratulations you are an adult now");
            break;
            case 23:
            System.out.println("now you can get married");
            break;
            case 68:
            System.out.println("you are a millionare");
            break;
            default:
            System.out.println("you are a failiure");

        }
        String var= "Parth";
        switch(var){
            case"a"->{
                System.out.println("you are lucky");
            }
            case"r"->{
                System.out.println("you are dumb");
            }
            default->
            System.out.println("dumb");
        }
        



    }
    
}
