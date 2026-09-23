public class Main {

    public static void main(String[] args){

        // super keyword = refers to the parent class used in constructors and method overiding, calls the patrent constructor to initialize attributes


        Student student = new Student("Harry","porter",3.45);

        student.showName();
        System.out.println(student.gpa);
        student.showGpa();
    }
    
}
