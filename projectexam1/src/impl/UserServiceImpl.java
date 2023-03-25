package impl;

import dao.UserDao;
import model.User;
import service.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
   private UserDao userdao = new UserDao();

    @Override
    public void userAdd(User user) {
             userdao.getUsers().add(user);
         }

    @Override
    public  User findById(int id) throws IdException {
return userdao.getUsers().stream()
        .filter(x->x.getId()==id)
        .findFirst().orElseThrow(()->new IdException(id+" is not found"));
    }



    @Override
    public String deleteUser(int id) {
        for (User userId : userdao.getUsers()) {
            if (userId.getId() == id) {
                userdao.getUsers().remove(userId);
            }
        }
        return "Успешно удален пользователь с ID: "+id;
    }

    @Override
    public ArrayList<User> getAllUsers() {

        return userdao.getUsers();
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "userdao=" + userdao +
                '}';
    }
}
