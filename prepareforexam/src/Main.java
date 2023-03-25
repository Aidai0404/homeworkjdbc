public class Main {
    public static void main(String[] args) {
     Cat cat=new Cat("antoshka",2,"meow"){
         @Override
         public void walk() {
             super.walk();
         }
     };

      cat.meow(cat.getMeow());
      cat.walk();

    }
}