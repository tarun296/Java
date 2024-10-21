import java.util.Scanner;

class Scanner_Demo{

    public static void main(String[] args){
        System.out.println("Hi Hello");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter your course:");
        String course = sc.nextLine();

        System.out.println("Your name is:" + name);
        System.out.println("Your Learning :" + course);

        sc.close();
    }
}