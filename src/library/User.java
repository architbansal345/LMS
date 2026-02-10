package library;

public abstract class User {
    private static int idCounter = 0;
    private static int totalUser = 0;
    private final String userId;
    private String name;
    private String contactInfo;
    public User(){
        this.userId = generateUniqueId();
        totalUser++;
    }
    public User(String name , String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUser++;
    }
    User (User other){
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        totalUser++;
    }
    public static String generateUniqueId(){
        return String.valueOf(++idCounter);
    }
    public String getName() {
        return name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }
    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();
}

