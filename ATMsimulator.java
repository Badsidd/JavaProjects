import java.util.Scanner;


public class ATMsimulator {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        double balance = 10000.00;
        int pin = 1234;

        System.out.println("Enter your PIN: ");
        int EnteredPIN = input.nextInt();

        if(EnteredPIN != pin) {
            System.out.println("Incorrect Pin Entered, exiting...");
            return;
        }

        while(true){
            System.out.println("\nATM Menu: ");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");

            int choice = input.nextInt();


            switch (choice){

                case 1:
                    System.out.println("Your balance is " +balance);
                    break;

                case 2:
                    System.out.println("Enter amount to deposit: ");
                    double deposit = input.nextDouble();
                    balance += deposit;
                    System.out.println("Your updated balance: " +balance);
                    break;

                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    if ( withdraw > balance)
                        System.out.println("Insufficient funds...");
                    else
                        System.out.println("Withdrawal done");
                    balance -= withdraw;
                    System.out.println("Your updated balance is " +balance);
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM");
                return;

                default:
                    System.out.println("Invalid");
            }

        }
    }
}
