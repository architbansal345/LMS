package library;

public class NovelBook extends Book{
    String genre;
    public  NovelBook(String isbn, String title, String author, String genre){
        super(isbn , title , author);
        this.genre = genre;
    }
    public  void displayBookDetails(){
        System.out.println("Novel details");
    }
}
