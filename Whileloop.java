import java.util.Scanner;
public class Whileloop{

    public static void main(String[] args){

        // Lets create a scanner

        Scanner inputScanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){

            System.out.print("Enter your name: ");
            name=inputScanner.nextLine();
        }

        System.out.printf("Hello %s", name);

        inputScanner.close();


    }
    
}