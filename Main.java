public class Main {

    public static void main(String[] args){

        Book book1 = new Book("Harry potter","J.K.Rowling",23);
        Book book2 = new Book("Counting alphabets","Ms.Racheal",3);

        Book[] bookObjects = {book1, book2};


        Library library = new Library("Kenya National Library",1979,bookObjects);


        library.displayLibraryInfo();
    }
    
}
