import java.util.Scanner;

public class Calculator {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();

        System.out.println("\nChoose Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int calculator = input.nextInt();

        switch(calculator){

            case 1:
                System.out.println("Addition: " +(a + b));
                break;

            case 2:

                if(a > b)
                    System.out.println("Subtraction: " +(a - b));
                else
                    System.out.println("Negative operation not supported");
                break;

            case 3:

                System.out.println("Multiplication: " +(a * b));
                break;

            case 4:

                if(b == 0)
                    System.out.println("Not supported");
                else
                    System.out.println("Division: " +(a / b));
                return;

            default:
                System.out.println("Invalid");


        }
    }
}
