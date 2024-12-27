package com.zidio.task_management.service;
import java.util.Set;

import com.zidio.task_management.model.User;

public interface UserService {

    public User addUser(User user);

    public Set<User> getUsers();

    public User getUserByUserId(Long userId);

    public User updateUser(User user);

    public boolean removeUser(Long userId);

    public User getUserByUserName(String userName);

    public boolean isValidUser(String email, String password);
}
