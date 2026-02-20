package DesignPattern.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry implements RegistryInterface {
    private Map<String, User> users;

    public Registry() {
        users = new HashMap<>();
    }
    @Override
    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user.getName());
    }

    @Override
    public User cloneUser(User user) {
        return users.get(user.getName()).cloneObject();
    }


}
