import java.util.Scanner;
public class Input {
    public static void main(String[] args){

        Scanner inputScanner= new Scanner(System.in);
        //creating a prompt so that the user knows what we expect from them
        System.out.println("Enter your name: ");
        //Accepting the input from the user

        String userName=inputScanner.nextLine();
        //Outputting the name we just received from the user

        System.out.println("Your name is "+userName);

        System.out.print("How old are you: ");
        int userAge=inputScanner.nextInt();
        System.out.println("You are "+userAge+" Years old");

        System.out.print("Whats your GPA: ");
        double userGpa= inputScanner.nextDouble();
        System.out.println("YOur gpa is "+userGpa);

        System.out.println("Are you a student(true/false): ");
        boolean isStudent=inputScanner.nextBoolean();
        if(isStudent){
            System.out.println("You are not enrolled in classes");
        }
        else{
            System.out.println("You are enrolled in classes");
        }

        //Closing the scanner to avoid unexpected behavior
        inputScanner.close();

        //.nextLine()-This method is used to read strings
        //.nextInt()-This method is used to read integers
        
    }
    
}
