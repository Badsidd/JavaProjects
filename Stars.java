
import java.util.Scanner;

public class Stars {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i=0; i<=5; i++){
            for (int j=1; j<=i; j++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
