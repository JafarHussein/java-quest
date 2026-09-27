public class Library {

    String name;
    int foundationYear;
    Book[] bookObjects;


    Library(String name, int foundationYear,Book[]bookObjects){
        this.name=name;
        this.foundationYear=foundationYear;
        this.bookObjects=bookObjects;
    }

    void displayLibraryInfo(){

        System.out.printf("The name of this library is %s, it was founded in %d and has %d books", this.name, this.foundationYear, this.bookObjects.length);
    }
    
}
