import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2022,11,27);
//        if(date.isAfter(LocalDate.now())){
//            System.out.println("ne prosr");
//        } else if (LocalDate.now().plusDays(10).isAfter(date)) {
//            System.out.println("7 days pros");
//        }else if(date.isBefore(LocalDate.now())){
//            System.out.println("pros");
//
//        }
//        Integer[]integers={1,2,3,4,5,6,7};
//        Stream.of(integers).map(c->c*0.1).forEach(x-> System.out.println(x));

//        Student st1=new Student(1,"Aijan","Alimova","Temirkhanova",5);
//        Student st2=new Student(2,"Dana","Akimova","Alimbekova",4);
//        Student st3=new Student(3,"Gaukhar","Jusupova","Kasymovna",3);
//        List<Student> students=new ArrayList<>();
//        students.add(st1);
//        students.add(st2);
//        students.add(st3);
//        students.stream().map(c->c.getSurname()).forEach(System.out::println);
//        students.stream().map(c->c.getName()+c.getName()).forEach(System.out::println);
//        Integer[]integers={1,2,3,4,5,6,7,8};
//        List<Integer>ints=new ArrayList<>();
//        ints=Stream.of(integers).map(x->x%3==0?0:x*10).filter(f->f>10).collect(Collectors.toList());
//        System.out.println(ints);
//
//      students.stream().filter(c->c.getMarks()>=4).forEach(System.out::println);
//      long count=students.stream().filter(c->c.getMarks()==2).count();

      User user1=new User("Aidai",2002);
     User user2=new User("Alina",2001);
      User user3=new User("Aijan",2006);
      List<User>users1=new ArrayList<>();
      users1.add(user1);
     users1.add(user2);
     users1.add(user3);
      List.of(user1,user3,user2);
//      users1.stream().map(c->2022-c.getAge()<18? c+"18den kichine":c+"18den chon").forEach(System.out::println);
//
//        List<Long> users=users1.stream().map(c->c.getAge()).toList();
//        List<User> users2=users1.stream().filter(c->2022-c.getAge()>18).toList();
//        List<String> users3=users1.stream().map(c->2022-c.getAge()<18? c+"18den kichine":c+"18den chon").toList();
//        System.out.println(users3);
//       users1.stream().map(c->2022-c.getAge()>18?c:null).forEach(System.out::println);




    }
}