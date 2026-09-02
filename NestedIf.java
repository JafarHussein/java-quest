public class NestedIf {

    public static void main(String[] args){

        boolean isStudent=true;
        boolean isSenior=false;
        double price=9.99;

        //Lets write a simple nested if program

        if(isStudent && isSenior){

            System.out.println("You have received the student discount of 10% and the senior discount of 20%");
            price*=0.7;
            System.out.printf("The price of the ticket is $ %.2f", price);
        }

        else if(isStudent){

            System.out.println("You have received the student discount of 10%");
            price*=0.9;
            System.out.printf("The price of the ticket is $ %.2f", price);
        }
        else{

            System.out.println("You have not received any discounts");
            System.out.printf("The price of the ticket is $ %.2f", price);
        }


        }

        
    }
    

