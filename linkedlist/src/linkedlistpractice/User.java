package linkedlistpractice;

import java.util.Comparator;

public class User  {
    int id;
    String name;
    int age;

    public User(int id,String name,int age) {
        this.id = id;
        this.name=name;
        this.age=age;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static Comparator<User>idsorts=new Comparator<User>() {
    @Override
    public int compare(User o1, User o2) {
        return o1.id- o2.id;
    }
};
   public static Comparator<User>agesorts=new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.age-o2.age;
        }
    };
   public static Comparator<User>namesorts=new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.name.compareTo(o2.name);
        }
    };


}
