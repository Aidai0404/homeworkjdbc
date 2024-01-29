public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println(getName() + " is walking");
    }
}
