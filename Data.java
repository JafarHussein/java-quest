public class Data {

    public static void main(String[] args){

        // Data types in Java

        /*

        Data types in java can be catergorized into :

        1.Primitive Data types- These are in built primitive types that store simple values directly in memory.They include:
             
            1.Integer
            2.Characters
            3.Boolean
            4.Float

        2.Reference Data types - These types store references to objects, They include:

            1.Strings
            2.Arrays
            3.Objects
        
        */

            //Integer data types

            int studentAge=21;
            System.out.println("You are "+studentAge+" Years old");

            int mathematicsScore=76;
            System.out.println("The highest score in mathematics was "+mathematicsScore);

            int currentYear=2026;
            System.out.println("The current year is "+currentYear);


            //floating point data types

            double pencilPrice=2.35;
            System.out.println("The lowest price in the store is "+pencilPrice);

            double averageHeight=175.4;
            System.out.println("According to the statics done, the average height in this city is "+averageHeight);


            double averageHourlyPay=23.50;
            System.out.println("The average hourly pay for a cooperate employee in kenya is "+averageHourlyPay);


            //Character data types

            char dollarSymbol='$';
            System.out.println("He paid "+dollarSymbol+" 34.50 for the ps3 controller");

            char overallGrade='A';
            System.out.println("His overall score in the kenya certficate of secondary education was "+overallGrade);

            //boolean values are not typically outputted on the screen, they are used in conditionally statements

            boolean isForSale=false;

            if(isForSale){

                System.out.println("The item is not for sale");
            }
            else{

                System.out.println("The item is for sale, its available in the shelves");
            }
    }
    
}
