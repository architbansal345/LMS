package DesignPattern.Prototype;

public interface RegistryInterface {
    void addUser(User user);
    void removeUser(User user);
    User cloneUser(User user);
}
