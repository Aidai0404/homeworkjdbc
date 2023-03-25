import java.util.ArrayList;

public class UserDao {

    private ArrayList<User> users;
    UserDao(ArrayList<User> users) {
        this.users = users;
    }
    public void getById(int Id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == Id) {
                System.out.println(users.get(i)+"\n");
            }
        }

        }
        public void add(User user){
            users.add(user);
        }
        public void getAllUsers(){
            for (int i = 0; i <users.size() ; i++) {
                System.out.println(users.get(i));
            }
            System.out.println("\n");

        }
        public void deleteAllUsers(){
        users.clear();
            System.out.println(users);
        }

        public void deleteById(int id){
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId() == id) {
                    System.out.println(users.remove(i));
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



