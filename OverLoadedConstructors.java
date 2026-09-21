public class OverLoadedConstructors {

    // Overloaded constructors allow classes to have multiple constructors with different parameters, enabling objects to be initialized in different ways

    String userName;
    String email;
    int age;

    OverLoadedConstructors(String userName){
        this.userName=userName;
        this.email="Not provided";
        this.age=0;
    }

    OverLoadedConstructors(String userName, String email){
        this.userName="Not provided";
        this.email=email;
        this.age=0;
    }

    OverLoadedConstructors(String userName, String email, int age){

        this.userName="Not provided";
        this.email="Unknown";
        this.age=18;
    }


    
}
