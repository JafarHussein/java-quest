public class VarArgs {

    public static void main(String[] args){

        // Varargs = allow methods to accept a varying number of arguements, makes method more flexible


    }

    static int add(int... numbers){

        int results=0;

        for(int i=0; i<numbers.length; i++){

            results+=numbers[i];
        }

        return results;
    }

    static double averageMarks(double... marksAverage){

        double average;

        double sum=0;

        for(int i=0; i<marksAverage.length; i++){

            sum+=marksAverage[i];
        }

        average=sum/marksAverage.length;

        return average;
    }
    
}
