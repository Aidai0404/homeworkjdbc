public class Cat extends Animal{

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void walk() {
        System.out.println("Cat is walking");
    }

    @Override
    public void voice() {
        System.out.println("Cat is meowing");
    }

    @Override
    public void live( int age ) {
        if(age>15){
            System.out.println("Cat cannot live those age");
        }else{
            System.out.println(getName() + " lives " + age);
        }
    }
}
