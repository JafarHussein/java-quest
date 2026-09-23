public class Dog extends Animal{


    String name;

    int livesCount=9;
    
    Dog(String name){
        this.name=name;
    }

    void speak(){

        System.out.println("The Dog goes Woof");
    }
    
}
