package practicetask;

import java.util.ArrayList;

public class UserDao {
       private ArrayList<User>users;

    public UserDao(ArrayList<User> users) {
        this.users = users;
    }

    public void add(User user){
        users.add(user);
        System.out.println(users);
    }
    public void getById(int id){
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getId()==id){
                System.out.println(users.get(i));
            }
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
