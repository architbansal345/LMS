package library;

public class Member extends  User {
    int borrowedBooksCount;
    static final int MAX_BORROW_LIMIT = 5;
    Member(){
        super();
        this.borrowedBooksCount = 0;
    }
    public Member(String name , String contactInfo){
        super(name , contactInfo);
        this.borrowedBooksCount = 0;
    }
    public void displayDashboard(){
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed"  + borrowedBooksCount);
    }
    public boolean canBorrowBooks(){
       return borrowedBooksCount < MAX_BORROW_LIMIT;
    }
}
