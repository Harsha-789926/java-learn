import java.util.Scanner;
import java.util.*;
public class add_calculator {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of  2 number is:"+sum);
    }
}
