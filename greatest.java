import java.util.*;
import java.util.scanner;

public class greatestof3{
    public static void main(string[]args)
    {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("A greater ");
        } else if (b>c && b>a) {
            System.out.println("B is greater");
        }else {
            System.out.println("C is greater");
        }

    }

        }