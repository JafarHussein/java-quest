import java.util.Scanner;
public class BankingProgramme {

    public static void main(String[] args){

        // Lets create a scanner for our programme

        Scanner inputScanner = new Scanner(System.in);

        double userBalance=0;
        boolean isRunning=true;
        int userChoice;
        double depositAmount;
        double withdrawAmount;

        System.out.println("***************************");
        System.out.println("Banking Programme");
        System.out.println("***************************");
        System.out.println("1. Show Balanace");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit the programme");
        System.out.println("***************************");


        while(isRunning){

            System.out.println("Enter your choice(1-4): ");
            userChoice=inputScanner.nextInt();


       

        switch(userChoice){

            case 1:

                showBalance(userBalance);
                break;

            case 2:

                System.out.println("*******************************************************");
                System.out.println("How much money do you want to deposit into your account: ");
                System.out.println("*******************************************************");

                depositAmount=inputScanner.nextDouble();
                userBalance=deposit(depositAmount, userBalance);
                break;

            case 3:
                System.out.println("*******************************************************");
                System.out.println("How much money do you want to withdraw from your account: ");
                System.out.println("*******************************************************");

                withdrawAmount=inputScanner.nextDouble();

                if(withdrawAmount > userBalance){

                System.out.println("*******************************************************");
                System.out.printf("You have insufficient funds in your account to withdraw $ %.2f, your account balance is $ %.2f", withdrawAmount, userBalance);
                System.out.println("*******************************************************");
                
                }
                else{

                    userBalance=withdraw(withdrawAmount, userBalance);
                }
                break;

            case 4:
                exitMessage();
                isRunning=false;
                break;

            default:
                System.out.println("Invalid input , please try again: ");

        }
        }

        inputScanner.close();


    }


    static void showBalance(double userBalance){

        System.out.printf("Your account balance is $ %.2f\n", userBalance);
    }

    static double deposit(double depositAmount, double userBalance){

        System.out.printf("You have succefully deposited $ %.2f into your account\n", depositAmount);

        userBalance += depositAmount;

        System.out.printf("Your new account balance is $ %.2f\n", userBalance);

        return userBalance;

    }

    static double withdraw(double withdrawAmount, double userBalance){

        System.out.printf("You have succefully withdrawed $ %.2f\n", withdrawAmount);

        double currentBalance= userBalance -= withdrawAmount;

        System.out.printf("Your account balance is $ %.2f\n", currentBalance);

        return userBalance;

    }

    static void exitMessage(){

        System.out.println("******************************");
        System.out.println("Thank you for banking with us");
        System.out.println("*******************************");
    }
    
}
