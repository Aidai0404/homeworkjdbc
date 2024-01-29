import java.util.Arrays;

public class Person {
    private String name;
    private String lastname;
    private int age;
    private int [] grades;
    private int grade;
    private String petName;

    public Person(String name, String lastname, int age, String petName) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.grade = 0;
        this.grades = new int[1];
        this.petName = petName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

//    boolean addGrade(int grade){
//       if(this.grade >= 1){
//           return false;
//       }
//       grades[this.grade] = grade;
//       this.grade++;
//       return true;
//    }
    public void addGrade1(int grade){
        for (int i = 0; i < grades.length; i++) {
            grades[i] = grade;
            System.out.println(grades[i]);
        }
    }

    boolean isGood(){
        for (int i = 0; i < grades.length; i++) {
             if(grades[i] != 9 && grades[i] !=10){
                 return false;
             }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", grades=" + Arrays.toString(grades) +
                ", grade=" + grade +
                ", pet=" + petName +
                '}';
    }
}
