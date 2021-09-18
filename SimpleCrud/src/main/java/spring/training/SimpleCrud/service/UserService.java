package spring.training.SimpleCrud.service;

import spring.training.SimpleCrud.entity.User;

import java.util.Collection;

public interface UserService {

    User createUser(User user);

    Collection<User> getUsers();

    User getUser(String userId);

    User updateUser(String userId, User user);

    void deleteUser(String userId);
}
