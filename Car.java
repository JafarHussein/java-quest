public class Car{

    String make = "Ford";
    String model ="Mustang";
    int year=2026;
    double price=58000.78;
    boolean isRunning=true;

    void start(){

        System.out.printf("Iam starting the car");
    }

    void accelerate(){

        System.out.printf("The car is accelerating");
    }

    void drive(){

        System.out.printf("You drive %s", model);
    }

    void brake(){

        System.out.printf("The %s just took a brake", model);
    }

}