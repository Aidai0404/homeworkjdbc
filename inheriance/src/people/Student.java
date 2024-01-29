package people;

public class Student extends Person{

    public Student(String name, String lastname, int age) {
        super(name, lastname, age);
    }

    @Override
    public void walk() {
        System.out.println("Student with this name: " + getName() + " is walking");
    }

    @Override
    public void doThing() {
                if(getAge()<10) {
                    System.out.println(getName() + " учится в начальном классе");
                }else if(getAge()>10 && getAge()<16) {
                    System.out.println(getName() + " учится в средней школе");
                }else if (getAge()>16 && getAge()<18){
                    System.out.println(getName() + " учится в старших классах");
                }else {
                    System.out.println(getName() + " не могут быть школьниками, так как уже давно переросли школьный период");
                }

        }

    @Override
    public void method() {

    }
}