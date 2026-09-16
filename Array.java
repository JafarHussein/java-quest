import java.util.Arrays;
public class Array {

    public static void main(String[] args){



        String [] fruits ={"Apple","Banana","Coconut"};


        fruits[3]="Pineapple";


        for(int i=0; i<fruits.length; i++){

            System.out.println(fruits[i]);
        }


        for(String fruit:fruits){

            System.out.print(fruit + " ");
        }


        // .sort()- sorts in ascending order
        // .fill(arrayName, element)-Fills the array provided with the element, basically the whole length becomes the array


    }
    
}
