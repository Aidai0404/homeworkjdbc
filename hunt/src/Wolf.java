public class Wolf extends Predator implements Eatable{
    @Override
    public void hunt() {
        System.out.println("Wolf is hunting");
    }

    @Override
    public void eat(Hare hare) {
        System.out.println("Wolf is eating a "+hare);
    }
}
