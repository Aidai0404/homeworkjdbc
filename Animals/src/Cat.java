public class Cat extends Animal{
    static String name;
    public Cat(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println(getName() + " is walking");
    }
}
