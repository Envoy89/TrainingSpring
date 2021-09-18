package spring.training.SimpleCrud.service;

import org.springframework.stereotype.Service;
import spring.training.SimpleCrud.entity.User;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    Map<String, User> users;

    @PostConstruct
    void init() {
        if (users == null) {
            users = new HashMap<>();
        }
    }

    @Override
    public User createUser(User user) {
        User createdUser = new User();

        createdUser.setUserName(user.getUserName());
        createdUser.setEmail(user.getEmail());
        createdUser.setPassword(user.getPassword());

        String userId = UUID.randomUUID().toString();
        createdUser.setUserId(userId);

        users.put(userId, createdUser);

        return createdUser;
    }

    @Override
    public Collection<User> getUsers() {
        return users.values();
    }

    @Override
    public User getUser(String userId) {
        return users.get(userId);
    }

    @Override
    public User updateUser(String userId, User user) {
        User userFromDb = users.get(userId);
        userFromDb.setUserName(user.getUserName());
        userFromDb.setUserName(user.getUserName());
        userFromDb.setPassword(user.getPassword());
        return userFromDb;
    }

    @Override
    public void deleteUser(String userId) {
        users.remove(userId);
    }
}
