package service;

import impl.IdException;
import model.User;

import java.util.ArrayList;

public interface UserService {
     void userAdd(User user);
     public User findById(int id) throws IdException;
     public String deleteUser(int id);
     public ArrayList<User> getAllUsers();
}
