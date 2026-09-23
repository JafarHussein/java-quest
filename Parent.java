public class Parent {


    String firstName;

    String lastName;


    Parent(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
    }

    void showName(){

        System.out.printf("%s %s \n", firstName, lastName);
    }
    
}
