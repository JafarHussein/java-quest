public class JavaObjects {

    public static void main(String[] args){

        // Objects in java are real world entities that hold attributes and can perform actions(methods)

        Car newCar1 = new Car();

        System.out.printf("The name of our car is %s\n", newCar1.make);
        System.out.printf("The model of the car is %s\n", newCar1.model);
        System.out.printf("This car was made in %d\n", newCar1.year);
        System.out.printf("The price of this car is %.2f\n", newCar1.price);
        if(newCar1.isRunning){

            System.out.print("My car is running");
        }
        else{

            System.out.printf("My car is not running");
        }

        newCar1.start();

        newCar1.accelerate();
    }
    
}
