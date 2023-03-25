import Course.Course;
import Group.Group;
import Student.Student;

public class Main {
    public static void main(String[] args) {

        Student student1=new Student(2004,"Aidai","Mamatbekova","izumisoft1@mail.ru");
        Student student2=new Student(2004,"Aida","Baijigitova","aida4@mail.ru");
        Student student3=new Student(2028,"Azamat","Aytaliyev","aza9@mail.ru");
        Student student4=new Student(2028,"Ainur","Temirhanov","hanov@mail.ru");
        Student students1[]={student1,student2};
        Student students2[]={student3,student4};
       Course course1=new Course("Math",796886288,"Nurperi",new int[]{1,2});
       Course course2=new Course("Java",79683532,"Timurlan",new int[]{1,2});

        System.out.println(course1+"\n");
        System.out.println("2."+course2+"\n");

        Group group1=new Group(students1,"Math",2022);
        Group group2=new Group(students2,"Java",2022);
        System.out.println(group1);
        System.out.println("\n2. "+group2);



    }
}