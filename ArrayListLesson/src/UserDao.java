import java.util.ArrayList;

public class UserDao {
    ArrayList<User>users;

    public UserDao(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public User findById(int id){
        User user1 = new User();
        for(User user : users){
            if(user.getId()==id){
               user1 = user;
            }
        }
       return user1;
    }

    public void add(User user){
        users.add(user);
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
