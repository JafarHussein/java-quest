public class ArrayO {

    String model;
    String color;

    ArrayO(String model, String color){
        this.model=model;
        this.color=color;
    }

    void drive(){

        System.out.printf("You drive "+this.color + " "+" "+this.model);
    }
    
}
