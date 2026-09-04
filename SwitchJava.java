import java.util.Scanner;
public class SwitchJava {

    public static void main(String[] args){

        // Switch statements in java are replacement to if else if else statements

        System.out.println("Choose a random number between 0 and 6, considering 0 is Sunday and 6 is Saturday");

        // Lets create a scanner

        Scanner inputScanner = new Scanner(System.in);

        int userInput = inputScanner.nextInt();

        // if(userInput == 0){

        //     System.out.printf("%d is Sunday",userInput);
        // }

        // else if (userInput == 1){

        //     System.out.printf("%d is Monday",userInput);

        // }

        // else if (userInput == 2){

        //     System.out.printf("%d is Tuesday",userInput);

        // }
        // else if (userInput == 3){

        //     System.out.printf("%d is Wednesday",userInput);

        // }
        // else if (userInput == 4){

        //     System.out.printf("%d is Thursday",userInput);

        // }
        // else if (userInput == 5){

        //     System.out.printf("%d is Friday",userInput);

        // }
        // else if (userInput == 6){

        //     System.out.printf("%d is Saturday",userInput);

        // }
        // else{

        //     System.out.printf("%d is out of range and doesn't correspond to any day of the week");
        // }

        //Instead of all writting all these nested if else statements you can use Switch statements

         switch(userInput){

            case 0:
                System.out.printf("%d is Sunday", userInput);
                break;
            case 1:
                System.out.printf("%d is Monday", userInput);
                break;
            case 2:
                System.out.printf("%d is Tuesday", userInput);
                break;
            case 3:
                System.out.printf("%d is Wednesday", userInput);
                break;
            case 4:
                System.out.printf("%d is Thursday", userInput);
                break;
            case 5:
                System.out.printf("%d is Friday", userInput);
                break;
            case 6:
                System.out.printf("%d is Saturday", userInput);
                break;
            default:
                System.out.printf("%d doesn't correspond to any days of the week", userInput);
         }

        inputScanner.close();


    }
    
}
