public class VariableScope {

    static int x=3; // This x has a class scope meaning that it can be used within the main method and other methods

    public static void main(String[] args){

        // Variable scope is where a variable can be accessed by the programme


        System.out.print(x);


    }

    static void doSomething(){

        int x = 10; // in this example integer x has a local scope , meaning it can only be accesed within this method

        System.out.print(x);
    }
    
}
