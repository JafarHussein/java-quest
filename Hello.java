public class Hello{
    public static void main(String[] args){
        
        Student student1 = new Student("Spongebob", 30,3.15,true);
        Student student2 = new Student("Patrick",27,2.1,false);


        System.out.printf("Student1's name is %s\n", student1.name);
        System.out.printf("Student1's age is %d\n",student1.age);
        System.out.printf("Student1's gpa is %1.f\n", student1.gpa);
        if(student1.isEnrolled){
            System.out.printf("Student1 is enrolled in a school");
        }
        else{

            System.out.printf("Student1 is not enrolled in a school");
        }

        System.out.println();

        System.out.printf("Student1's name is %s\n", student2.name);
        System.out.printf("Student1's age is %d\n",student2.age);
        System.out.printf("Student1's gpa is %1.f\n", student2.gpa);
        if(student2.isEnrolled){
            System.out.printf("Student1 is enrolled in a school");
        }
        else{

            System.out.printf("Student1 is not enrolled in a school");
        }
    }
}