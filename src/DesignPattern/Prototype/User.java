package DesignPattern.Prototype;

public class User implements  Clone<User> {
    private String name;
    private String password;
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public User(User user){
        this.name = user.getName();
        this.password = user.getPassword();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public User cloneObject() {
        return new User(this);
    }
}
