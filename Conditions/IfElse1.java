import java.util.Scanner;
public class IfElse1 {


    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number > 10){
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

     }
}