public class Cat extends Animal{
    private String meow;

    public Cat(String name, int age,String meow) {
        super(name, age);
        this.meow=meow;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }
    public void meow(String meow){
            if(this.meow==meow){
            System.out.println("Cat meows");}

    }
    @Override
    public void walk() {
        System.out.println("Cat walks");
    }

    @Override
    public void walkable() {

    }


    @Override
    public String toString() {
        return "Cat{" +
                "meow='" + meow + '\'' +
                '}';
    }
}
