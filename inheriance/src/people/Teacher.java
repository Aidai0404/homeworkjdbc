package people;

public  class Teacher extends Person{
    public static Student[]students;

    public Teacher(String name, String lastname, int age, Student[]students) {
        super(name, lastname, age);
        this.students=students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public void walk() {
        System.out.println("Teacher with this name: " + getName() + " is walking");
    }

    public static void staticMethod(){
        System.out.println("static");
    }

    @Override
    public void doThing() {
            for (int j = 0; j < students.length; j++) {
                if (students[j].getAge() < 10) {
                    System.out.println("Преподаватель с таким именем " + getName() + " учить школьника начальных классов " + students[j].getName() + ", которому " + students[j].getAge() + " лет");
                } else if (students[j].getAge() > 10 && students[j].getAge() < 16) {
                    System.out.println("Преподаватель с таким именем " + getName() + " учить школьника средних классов " + students[j].getName() + ", которому " + students[j].getAge() + " лет");
                }else if (students[j].getAge()>16 && students[j].getAge()<18){
                    System.out.println("Преподаватель с таким именем " + getName() + " учить школьника старших классов " + students[j].getName() + ", которому " + students[j].getAge() + " лет");
                }
            }
        }


    @Override
    public void method() {

    }
}

