import java.util.Random;
public class RamNum{
    public static void main(String[] args){

        Random randomObject= new Random();

        int randomNumber;

        randomNumber=randomObject.nextInt();

        System.out.println(randomNumber);

        //import the random module using import java.util.Random;

        //Create a random object using Random randomObject = new Random();

        //randomNumber= randomObject.nextInt();

        //Specifying a range randomObject.nextInt(starting_range, ending_range); - The ending range is not inclusive

        //lets get a random number in the range 90 to 100

        int randomNumber2= randomObject.nextInt(90,101);
        System.out.println(randomNumber2);
    }
}