import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args)  {
//        Set<Integer>set1=new HashSet<>();
//        set1.add(0);
//        set1.add(2);
//        set1.add(1);
//        set1.add(3);
//        set1.add(4);
//
//        Set<Integer>set2=new HashSet<>();
//        set2.add(0);
//        set2.add(5);
//        set2.add(1);
//        set2.add(2);
//        set2.add(3);
        User user1=new User(1,"Aidai",18);
        User user2=new User(2,"Aijan",19);
        User user3=new User(3,"Aisuluu",22);
        ArrayList userss=new ArrayList<>();
        userss.add(user1);
        userss.add(user2);
        userss.add(user3);
        UserDao users2=new UserDao(new ArrayList<>());
        users2.add(user1);
        users2.add(user2);
        users2.add(user3);
        System.out.print(users2);
        users2.getById(2);
        users2.getAllUsers();
        users2.deleteById(3);
        System.out.println(users2);
        users2.deleteAllUsers();
        System.out.println(users2);
//        System.out.println(symmetricDifference(set2,set1));
//
//
//    }
//    public static  Set<Integer>symmetricDifference(Set<Integer>set2,Set<Integer>set1) {
//      Set<Integer>symmDiff=new HashSet<>(set2);
//      symmDiff.addAll(set1);
//        Set<Integer> tmp = new HashSet<Integer>(set2);
//        tmp.retainAll(set1);
//        symmDiff.removeAll(tmp);
//        return symmDiff;





        }


    }
