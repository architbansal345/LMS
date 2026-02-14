package library;

public class Textbook extends Book {
        String subject;
        int edition;
        public Textbook(String isbn, String title, String author, String subject, int edition){
            super(isbn , title , author);
            this.subject = subject;
            this.edition = edition;
        }
        public  void displayBookDetails(){
            System.out.println("TextBook details");
        }
}
