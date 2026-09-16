public class searchArray {


    public static void main(String[] args){


        int [] numberArray ={1,2,3,4,5,6,7,8,9,10};

        int target=5;

        for(int i=0; i<numberArray.length; i++){

            if(target == numberArray[i]){

                System.out.printf("We found the target %d at index %d", target, i);
                break;
            }
            else{

                System.out.println("We didn't find the target");
            }
        }
    }
    
}
