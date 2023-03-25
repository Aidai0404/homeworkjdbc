package practicetask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        User user1=new User(1,"Aijan",18);
        User user2=new User(2,"Elnar",19);
        User user3=new User(3,"Aidai",18);
        ArrayList<User>users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        UserDao users2=new UserDao(users);
        users2.getById(1);
        users2.add(user3);

    }
}
