import java.util.Scanner;
public class numguess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rand=(int)(Math.random()*100)+1;
        int guess=0;

        while(guess!=rand){
            System.out.println("Enter your guess:");
            guess=sc.nextInt();
            if(guess<1 || guess>100){
                System.out.println("Invalid input! Please enter a number between 1 and 100:");   
            }else if(guess<rand){
                System.out.println("Too low! Try again.");
            }else if(guess>rand){
                System.out.println("Too high! Try again.");
        }else
        {
            System.out.println("Congratulations");
        }
       }
    }
}