import dao.UserDao;
import gender.Gender;
import impl.IdException;
import impl.UserServiceImpl;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User(1, "Aidana", 18,Gender.FEMALE.toString());
        User user2 = new User(2, "Alimjan", 15,Gender.MALE.toString());
        User user3 = new User(3, "Asylai", 20,Gender.FEMALE.toString());

//        UserDao userDao=new UserDao(users);
        UserServiceImpl userService = new UserServiceImpl();
        userService.userAdd(user1);
        userService.userAdd(user2);
        userService.userAdd(user3);

        try {
            System.out.println(userService.findById(2));
            System.out.println(userService.getAllUsers());
            System.out.println(userService.deleteUser(2));
            System.out.println(userService.getAllUsers());

        } catch (IdException e) {
            System.out.println(e.getMessage());
        }

    }
}