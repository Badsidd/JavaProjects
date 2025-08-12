
import java.util.Scanner;


public class Grades {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Grades from A/B/C/D/E");
        char grade = input.next().charAt(0);

        switch (grade){

            case 'A':
            System.out.println("Excellent");
            break;

            case 'B':
                System.out.println("Very Good");
                break;

            case 'C':
                System.out.println("Good");
                break;

            default:
                System.out.println("Invalid");

        }


    }
}
