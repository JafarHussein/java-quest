import java.util.Scanner;
public class Methods{

    public static void main(String[] args){

        System.out.println("We are going to sing a happy birthday song to you ");

        System.out.print("What is your name: ");

        Scanner inputScanner = new Scanner(System.in);

        String userName = inputScanner.nextLine();

        

        System.out.print("How old are you: ");

        int userAge= inputScanner.nextInt();

        happyBirthday(userName, userAge);

        inputScanner.close();

    }

    static void happyBirthday(String userName, int userAge){


        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you");
        System.out.printf("Happy birthday dear  %s \n", userName);

        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you");
        System.out.printf("You are %d years old \n", userAge);



    }
}