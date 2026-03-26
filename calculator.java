import java.util.Scanner;
public class calculator {
    public int add(int a,int b){
        return a+b;
       }
    public int sub(int a,int b){
        return a-b;
       }
    public int mul(int a,int b){
        return a*b;
       }
     public int div(int a,int b){
        if(b==0){
            System.out.println("Division by zero error");
        }else{
         return a/b;
        }
       return 0;
       }  
    public static void main(String[] args) {
        int a,b,ch;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value for a");
         a=sc.nextInt();
        System.out.println("Enter the value for b");
        b=sc.nextInt();
        calculator ad=new calculator();

        
        while(true){
            System.err.println("Enter your choice: 1.Add 2.Subtract 3.Multiply 4.Divide");
             ch=sc.nextInt();
        switch (ch) {
            case 1: System.out.println("The sum is "+ad.add(a,b));
                break;
            case 2:System.out.println("The is Difference is "+ad.sub(a,b));
                break;
            case 3:System.out.println("The Product is "+ad.mul(a,b)); 
                break;
            case 4:System.out.println("the sum is "+ad.div(a,b));
                break;       
            default:System.out.println("Enter a valid choice");
             sc.close();
             return;
        }}
       
    }
    }

