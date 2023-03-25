package dao;

import model.User;

import java.util.ArrayList;

public class UserDao {
    ArrayList<User>users = new ArrayList<>();


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
