public class Main {
    public static void main(String[] args) {
      Bear bear=new Bear();
      bear.hunt();

      Wolf wolf=new Wolf();
      wolf.hunt();

      Hare hare1=new Hare("hare1");
      Hare hare2=new Hare("hare2");
      Hare hare3=new Hare("hare3");

      Hare[] hares=new Hare[]{hare3,hare2};
      for (Hare eath: hares){
       wolf.eat(eath);
      }

      Lion lion=new Lion();
      lion.hunt();

      Hare[] hares2=new Hare[]{hare1};
      for(Hare eatk: hares2) {
        lion.eat(eatk);
      }

    }
}