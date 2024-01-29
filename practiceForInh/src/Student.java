public class Student extends Person{
    public Student(String name, String lastname, String petName, int age) {
        super(name, lastname, petName, age);
    }

    @Override
    public void addGrade(int grade) {
        super.addGrade(grade);
    }

    @Override
    public boolean isGood() {
        return super.isGood();
    }
}
