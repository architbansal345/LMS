package library;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    static List<Book> bookInventory = new ArrayList<>();
    List<User> registeredUsers = new ArrayList<>();

    void addBook(Book book){
        bookInventory.add(book);
    }
    void registerUser(User user){
        registeredUsers.add(user);
    }
    static List<Book> searchBooks(String criteria){
        List<Book> result = new ArrayList<>();
        for(Book book : bookInventory){
            if(book.getAuthor().equalsIgnoreCase(criteria) ||
                    book.getTitle().equalsIgnoreCase(criteria)){
                result.add(book);
            }
        }
        return result;
    }
    static List<Book> searchBooks(String criteria, String type){
        List<Book> result = new ArrayList<>();
        for(Book book : bookInventory){
            if(book.getAuthor().equalsIgnoreCase(criteria) ||
                    book.getTitle().equalsIgnoreCase(criteria)){
                result.add(book);
            }
        }
        return result;
    }
}
