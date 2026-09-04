public class StringMethods {

    public static void main(String[] args){

        // Some useful string methods

        /*

        1.length()-This returns the length of a string
        2.charAt(index)-THis returns a character at a particular index
        3.indexOf(character)-This returns the first occurence of a character
        4.lastIndexOf(character)-This returns the last occurence of a character
        5.toUpperCase()-This makes all the characters uppercase
        6. .toLowerCase()-This makes all the characters lowercase
        7. .trim()-This removes all the white spaces
        8. .replace(character_being_replaced, character_being_introduced)-This method replaces all the occurence of a certain character

        9. isEmpty()-This checks if a string is empty by returning either true or false
        10.contains(character)-Checks if a string contains a certain character
        11. .equals(value)-Checks if two strings are the same, checks if two strings have the same exact characters
        12 .equalsIgnoreCase(value)-This checks if two strings are equal while ignoring case sensitivity
        
        */

        String name = "Spongebob SquarePants";
        
        //Lets check the length of our string

        int lengthString=name.length();
        System.out.println("The length of the above string is "+lengthString);

        //Lets check if our string contains a certain character
        if(name.charAt(0)=='S'){

            System.out.println("The character at index zero of the string is S");
        }
        else{

            System.out.println("The character at index zero of the string is not S");
        }

        //Lets return the first occurence of p in the string

        int firstOccurence=name.indexOf('p');

        System.out.println("The first of occurence of p is at index "+firstOccurence);

        //Lets find the last occurence of p

        int lastOccurence=name.lastIndexOf('p');
        System.out.printf("The last occurence of p is at index %d", lastOccurence);


        //Lets convert the whole name to uppercase

        String uppercaseName=name.toUpperCase();
        System.out.printf("The uppercase version of the string is %s",uppercaseName);

        //lets convert the name to lowercase
        String lowercaseName= name.toLowerCase();
        System.out.printf("Your name is %f", lowercaseName);
    }
    
}
