public class Main {

    public static void main(String[] args){


        Car car = new Car("Mustang","Yellow",10000.50);

        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());


        car.setColor("Purple");
        car.setPrice(3000.50);

        

    }
    
}
