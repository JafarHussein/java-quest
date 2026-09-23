public class Main {
    public static void main(String[] args){

        Dog dog = new Dog("Scooby");
        Cat cat = new Cat("Gerfild");
        System.out.println(cat.isAlive);
        System.out.println(dog.isAlive);
        cat.eat();
        dog.eat();
    }
}
