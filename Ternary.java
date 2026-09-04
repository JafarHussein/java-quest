public class Ternary {

    public static void main(String[] args){

        // Ternary operator is an alternative to if else statements, more like a shorter version of if else statements

        // Normal if else statements look like this

        int score = 70;

    //     if(score >= 60){

    //         System.out.printf("You scored %d in the mathematics test thats a passing grade", score);
    //     }
    //     else{

    //         System.out.printf("You scored a %d in the mathematics test thats a failing grade", score);
    //     }


    String grade =  score >= 60 ? "Pass" :"Fail";
    System.out.printf("You scored an %s in mathematics", grade);


     }


    
}
