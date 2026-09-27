public class Book {

    String title;
    String author;
    int pageNum;


    Book(String title, String author, int pageNum){
        this.title=title;
        this.author=author;
        this.pageNum=pageNum;
    }

    void displayBookInfo(){

        System.out.printf("The title of the book is %s and the author of the book is %s, the book has %d pages",this.title, this.author, this.pageNum);
    }
    
}
