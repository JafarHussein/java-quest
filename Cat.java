public class Cat extends Animal{

    String name;

    int livesCount=9;

    Cat(String name){
        this.name=name;
    }

    void speak(){
        System.out.println("The cat goes meow");
    }
    
}
