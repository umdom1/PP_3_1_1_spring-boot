package ru.denisov.PP_3_1_1_spring_boot.service;

import ru.denisov.PP_3_1_1_spring_boot.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAllUsers();
    User getUser(long id);
    void updateUser(User user);
    void deleteUser(long id);

}