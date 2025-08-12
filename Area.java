import java.util.Scanner;


public class Area {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle: ");
        int a = sc.nextInt();

        System.out.println("Enter the breadth of the Rectangle: ");
        int b = sc.nextInt();

        int area = a * b;

        System.out.println("The area of the Rectangle is " +area);


        System.out.println("Enter the radius of the circle: ");
        int r = sc.nextInt();
        int diameter = 2 * r;
        System.out.println("Diameter of the Circle " +diameter);

        final float pi = 3.14F;
        float areaCircle = (float) pi * r * r;


        System.out.println("Area of the Circle: " +areaCircle);


    }
}
