import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 56;
        Integer i = a; // Auto Boxing

        Integer s = 45;
        int b = s; // UnBoxing;

//        ArrayList<String>strings = new ArrayList<>();//Cat cat = new Cat();
//        strings.add("Hello Java-6");
        List<Integer> integers = new ArrayList<>();//Animal cat = new Cat();
        integers.add(5);
        integers.add(6);
        integers.add(3);
        integers.add(7);
  //      System.out.println(integers.get(2));
  //      integers.set(0,7);
   //     System.out.println(integers.get(0));
  //      System.out.println(integers.size());
   //     integers.clear();
    //    integers.remove(1);
    //    System.out.println(integers.contains(5));
    //    System.out.println(integers.get(1));
     //   System.out.println(integers.isEmpty());

        Iterator iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        for(Integer integer : integers){
//            System.out.println(integer);
//        }

//        for (int j = 0; j < integers.size(); j++) {
//            System.out.println(integers.get(j));
//        }















        ArrayList<User>users = new ArrayList<>();
        users.add(new User(1,"Aidai",19));
        users.add(new User(2,"Dilnaz",17));
        UserDao userDao = new UserDao(users);
        userDao.add(new User(3,"Ruslanbek TaiPolotov",28));
        System.out.println(userDao.findById(3));











    }
}