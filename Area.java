import java.util.Scanner;
public class Area{

    public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("This is a simple programme that calculates the area of a rectangle");

        System.out.println("Whats the length of your rectangle: ");
        int lengthRectangle =inputScanner.nextInt();

        System.out.println("Whats the width of your rectangles: ");
        int widthRectangle=inputScanner.nextInt();

        int areaRectangle= lengthRectangle * widthRectangle;
        System.out.println("The area of your rectangle is "+areaRectangle+" square centimeters");

        inputScanner.close();
    }
}