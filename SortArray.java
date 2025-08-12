import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class SortArray {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int[] number = {4,6,8,3,2,1};

        Arrays.sort(number);

        System.out.println("Sorted Array: ");

        for (int num: number)
            System.out.print(num + " ");


    }
}
