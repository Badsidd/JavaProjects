import java.util.Scanner;
import java.util.Arrays;

public class LargestNum {

    public static void main(String[]args){

        int[] arr = {4,6,7,8,9,2};

        Arrays.sort(arr);

        for (int num: arr)
            System.out.print(num + " ");


        int max = arr[0];
        int min = arr[0];

        for (int num: arr) {

            if (num > max) max = num;
            if (num < min) min = num;
        }
            System.out.println("Max" + max);
        System.out.println("Min" + min);
        }

    }

