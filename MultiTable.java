import java.util.Scanner;

public class MultiTable {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i = 0; i<=10; i++){

            System.out.println(number + "x" + i + "=" +(number*i));
        }

    }
}
