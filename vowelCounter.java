import java.util.Scanner;

public class vowelCounter {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next().toLowerCase();

        int count = 0;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count ++;
            }
        }
        System.out.println("Vowel Count " +count);

    }
}
