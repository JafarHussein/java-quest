import java.util.Scanner;
public class MathModule {

    public static void main(String[] args){

        //Math.PI - This returns all the digits of PI
        //Math.pow(base,power) - This is used to raise a certain base to a certain power
        //Math.sqrt(value)-This method returns the square root of the provided value
        //Math.abs(value)-This method returns the absolute value of the value provided
        //Math.round(value)-This is going to round the number to the nearest whole integer
        //Math.ceil(value)-This method is going to round up
        //Math.floor(value)-This is going to round down
        //Math.max(value1, value2)-This is going to find the greatest value
        //Math.min(value1, value2)-This is going to find the minimum for the provided value

        // We are going to create a simple programme to calculate the hypoteneuse of a triangle

        //Lets create a scanner object

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Please provide the width of your triangle: ");
        int triangleWidth= inputScanner.nextInt();

        System.out.println("Please provide the height of your triangle: ");
        int triangleHeight= inputScanner.nextInt();

        double hypoteneuse = Math.sqrt(Math.pow(triangleWidth,2) + Math.pow(triangleHeight,2));

        System.out.println("Provided width: "+triangleWidth);
        System.out.println("Provided Height: "+triangleHeight);
        System.out.println("The hypoteneuse of your triangle is "+hypoteneuse);

        inputScanner.close();
    }
    
}
