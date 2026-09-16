public class OverLoadedMethods {

    public static void main(String[] args){


        // overloaded Methods are methods with the same name but different parameters, therefore they have different method signature

      System.out.print(add(1,2));
      System.out.print(add(1,2,3));
    }

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a , double b, double c){

        return a + b + c;
    }
    
}
