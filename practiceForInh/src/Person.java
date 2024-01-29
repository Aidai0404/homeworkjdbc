import java.util.Arrays;

public class Person {

    private String name;
    private String lastname;
    private String petName;
    private int age;
    private int grade;
    private int[]grades;

    public Person(String name, String lastname, String petName, int age) {
        this.name = name;
        this.lastname = lastname;
        this.petName = petName;
        this.age = age;
        this.grade = 0;
        this.grades = new int[1];
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

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addGrade(int grade){
        for (int i = 0; i < grades.length; i++) {
            grades[i] = grade;
            System.out.println(grade);
        }
    }

    public boolean isGood(){
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] != 9 && grades[i]!=10){
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
                ", petName='" + petName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
