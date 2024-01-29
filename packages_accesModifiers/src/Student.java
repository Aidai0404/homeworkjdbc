public class Student extends Person{


    public Student(String name, String lastname, int age, String petName) {
        super(name, lastname, age, petName);
    }

    @Override
    public void addGrade1(int grade) {
        super.addGrade1(grade);
    }


    @Override
    boolean isGood() {
        return super.isGood();
    }
}
