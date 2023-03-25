import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<Student>students=new HashSet<>();
        Student student1=new Student("Arina",19);
        Student student2=new Student("Ann",22);
        Student student3=new Student("Alina",20);
        Student student4=new Student("Katerina",18);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
      for(Student students1:students){
          System.out.println(students1);
      }
    }
    }
