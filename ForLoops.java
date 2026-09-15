import java.util.Scanner;
public class ForLoops {

    public static void main(String[] args) throws InterruptedException{

        // Simulate a count down


        Scanner inputScanner = new Scanner(System.in);

        System.out.print("We want to simulate a count down, where should we begin: ");

        int countDownStart= inputScanner.nextInt();


        for(int i=countDownStart; i>=1; i--){

            System.out.println(i);
            Thread.sleep(1000);
        }


        System.out.println("HAPPY NEW YEAR");

        inputScanner.close();

    }
    
}
