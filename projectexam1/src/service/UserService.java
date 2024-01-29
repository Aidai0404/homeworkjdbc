package service;

import impl.IdException;
import model.User;

import java.util.ArrayList;

public interface UserService {
     void userAdd(User user);
     User findById(int id) throws IdException;
     String deleteUser(int id);
     ArrayList<User> getAllUsers();
}
