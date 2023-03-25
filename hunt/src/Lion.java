public class Lion extends Predator implements Eatable{
    @Override
    public void hunt() {
        System.out.println("Lion is hunting");
    }

    @Override
    public void eat(Hare hare) {
        System.out.println("Lion is eating a "+hare);
    }

}
