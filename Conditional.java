import java.util.Scanner;
public class Conditional {
    public static void main(String[] args){
        // if statements are used to control the follow of a programme. The program executes based on a certain condition

        //Sample programme

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("This is a simple programme that does age validation");

        System.out.println("How old are you: ");

        int userAge= inputScanner.nextInt();

        if(userAge>=18){
            System.out.println("The goverment considers you an adult");
        }
        else{

            System.out.println("The goverment considers you a minor because you still under the age of 18");
        }

        inputScanner.close();
    }
}
