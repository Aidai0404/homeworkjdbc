import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Double> r = new ArrayList<>();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses<String, Integer, Double> a = new FavoriteClasses("Hello", 67, r.get(0));
        System.out.println("My favorites are " + a.getFav1() + ", " + a.getFav2() + ", and " + a.getFav3() + ".");
    }

    public static class FavoriteClasses <A,B,C>{
        private A  favorite1;
        private B favorite2;
        private C  favorite3;

        FavoriteClasses(A fav1, B fav2, C fav3) {
            this.favorite1 = fav1;
            this.favorite2 = fav2;
            this.favorite3 = fav3;
        }


        public A getFav1() {
            return this.favorite1;
        }


        public B getFav2() {
            return this.favorite2;
        }


        public C getFav3() {
            return this.favorite3;
        }

    }

    }

