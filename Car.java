public class Car {

    private String model;
    private String color;
    private double price;

    Car(String model, String color, double price){
        this.model=model;
        this.color=color;
        this.price=price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price;
    }

    // setters methods


    void setColor(String newColor){
        this.color=newColor;
    }

    void setPrice(double newPrice){

        this.price=newPrice;
    }
}
