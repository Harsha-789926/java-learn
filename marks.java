import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter your choice");
            System.out.println("1.Enter marks \n 0.Exit");
            choice=sc.nextInt();

            if(choice==1){
                    System.out.println("Enter the marks (0-100)");
                    int mark=sc.nextInt();

                    if(mark>=90){
                        System.out.println("Grade A");
                    }
                    else if(mark>=80){
                        System.out.println("Grade B");
                    }
                    else if(mark>=70){
                        System.out.println("Grade C");
                    }
                    else{
                        System.out.println("Grade D");
                    }
                }
              }while(choice!=0);

            sc.close();
        
    }
}
