public class Student extends Parent{


    double gpa;


    Student(String firstName, String lastName, double gpa){

        super(firstName, lastName);
        this.gpa=gpa;

    }

    void showGpa(){

        System.out.printf("%s's gpa is %.2f", firstName, gpa);
    }
    
}
