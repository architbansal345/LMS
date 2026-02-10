package library;

public class Librarian extends  User{
    String employeeNumber;
    public  Librarian(String name , String contactInfo , String employeeNumber){
        super(name , contactInfo);
        this.employeeNumber = employeeNumber;
    }
    public void displayDashboard(){
        System.out.println("Librarian Dashboard");
        System.out.println("Employee Number: " + employeeNumber);
    }
    public boolean canBorrowBooks(){
        return true;
    }
    public void addNewBook(){

    }
    public void removeBook(){

    }
}
