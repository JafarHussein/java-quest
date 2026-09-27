import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner inputScanner = new Scanner(System.in);

        Animal animal;

        System.out.println("Would you like a cat or a dog for a pet(choose 1 for dog and 2 for cat): ");

        int choice=inputScanner.nextInt();

        if(choice == 1){

            animal = new Dog();
            animal.speak();
        }
        else{

            animal= new Cat();
            animal.speak();
        }

        inputScanner.close();
    }
}