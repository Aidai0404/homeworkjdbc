import java.util.List;

public class UserDao {
    private List<User> userList;

    public UserDao(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void getUserById(long userId) {
            for (User user : userList) {
                if (userId == user.getId()) {
                    System.out.println(user);
                }
            }
    }

    public void add(User user){
        userList.add(user);
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "userList=" + userList +
                '}';
    }
}
