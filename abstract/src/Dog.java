public class Dog extends Animal{

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void voice() {
        System.out.println("Dog is gavking");
    }

    @Override
    public void live( int age ) {
        if(age>15){
            System.out.println("Dog cannot live those age");
        }else{
            System.out.println(getName() + " lives " + age);
        }
    }
}
