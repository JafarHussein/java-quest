import java.util.Scanner;

public class userInputArray {


    public static void main(String[] args){

        // lets create an empty array with 3 spaces


        Scanner inputScanner = new Scanner(System.in);

        String[] foods = new String[3];


        System.out.println("Choose three(3) food types you would like to be in the menu: ");

        for(int i=0; i<foods.length; i++){

            foods[i]=inputScanner.nextLine();
        }

        System.out.println("Here are all the foods you requested to be added into the menu: ");

        for (int i=0; i<foods.length; i++){

            System.out.println(foods[i]);
        }

        inputScanner.close();

       



    }
    
}
