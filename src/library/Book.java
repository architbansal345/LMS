package library;

abstract class Book  implements  Lendable{
    String isbn;
    String title;
    String author;
    boolean isAvailable;
    public Book(){
        this.isAvailable = true;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public Book(Book other) {
        this.isAvailable = other.isAvailable;
        this.author = other.author;
        this.title = other.title;
        this.isbn = other.isbn;
    }
    public boolean lend(User user){
        if(isAvailable && user.canBorrowBooks()){
            isAvailable = false;
            return true;
        }
        return false;
    }
    public void returnBook(User user) {
        isAvailable = true;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public abstract void displayBookDetails();
}
