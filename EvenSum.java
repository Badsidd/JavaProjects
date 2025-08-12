import java.util.Scanner;

public class EvenSum {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = input.nextInt();
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            if (digit%2 == 0){
                sum += digit;
            }

            num /= 10;
        }
        System.out.println("Sum of digits: " +sum);
    }
}
