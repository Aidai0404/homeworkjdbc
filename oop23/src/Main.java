import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     University uni=new University();
     uni.setName("Name of University: Oxford University");
     uni.setYearofopeningofuni(1856);
     uni.address("Address: UK,London.");
        System.out.println(uni.getName());
        System.out.println("Opening year: "+uni.getYearofopeningofuni()+";");
        System.out.println(uni.getAddress());
      Group group1=new Group();
      group1.setFaculty("Faculty of Linguistics;");
      group1.setQuantityofstudents(16);
      group1.setSubjects("English and oriental languages");
        System.out.println("\n1.Group: "+group1.getFaculty());
        System.out.println("Quantity of students: "+group1.getQuantityofstudents());
        System.out.println("Main subjects: "+group1.getSubjects()+".");
      Group group2=new Group();
      group2.setFaculty("Faculty of Law;");
      group2.setQuantityofstudents(14);
      group2.setSubjects("History,Law.");
        System.out.println("\n2.Group: "+group2.getFaculty());
        System.out.println("Quantity of students: "+group2.getQuantityofstudents());
        System.out.println("Main subjects: "+group2.getSubjects());
      Students student1=new Students();
      student1.setName("Isaak Orwell;");
      student1.setAge(19);
      student1.setFaculty("Faculty of Linguistics;");
      student1.setFavouritesubjects("Japanese and korean languages;");
      student1.setCountry("USA");
        System.out.println("\n1.Student: "+student1.getName());
        System.out.println("Age: "+student1.getAge());
        System.out.println("Favourite subgects: "+student1.getFavouritesubjects());
        System.out.println("Country: "+student1.getCountry()+".");
      Students student2=new Students();
        student2.setName("Aiana Seitova;");
        student2.setAge(20);
        student2.setFaculty("Faculty of Law;");
        student2.setFavouritesubjects("History,Human rights;");
        student2.setCountry("Kyrgyzstan");
        System.out.println("\n2.Student: "+student2.getName());
        System.out.println("Age: "+student2.getAge());
        System.out.println("Favourite subgects: "+student2.getFavouritesubjects());
        System.out.println("Country: "+student2.getCountry()+".");
        Students stu3=new Students();
        stu3.setName("Quan Si");
        stu3.setAge(21);
        stu3.setFaculty("Faculty of Law;");
        stu3.setFavouritesubjects("History, Theory of State and Law;");
        stu3.setCountry("China");
        System.out.println("\n3.Student: "+stu3.getName()+";");
        System.out.println("Age: "+stu3.getAge());
        System.out.println("Favourite subgects: "+stu3.getFavouritesubjects());
        System.out.println("Country: "+stu3.getCountry()+".");

    }

}