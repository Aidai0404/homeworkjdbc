package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> r = new ArrayList();
        r.add(6.3);
        r.add(5.9);
        FavoriteClasses<String,Double,Double> a = new FavoriteClasses("Hello", 67,  r.get(0));
        System.out.println("My favorites are " + a.favorite1 + ", " + a.favorite2+ ", and " + a.favorite3 + ".");
    }

    public static class FavoriteClasses <T,S,D>{
        private T favorite1;
        private D  favorite2;
        private S  favorite3;

        FavoriteClasses(T fav1,D fav2, S fav3) {
            this.favorite1 = fav1;
            this.favorite2 = fav2;
            this.favorite3 = fav3;
        }

        public void setFavorite1(T favorite1) {
            this.favorite1 = favorite1;
        }

        public T getFavorite1(T favorite1) {
            return (this.favorite1);
        }

        public D setFavorite2() {
            return favorite2;
        }

        public D getFavorite2(D favorite1) {
            return (this.favorite2);
        }

        public void setFavorite3(S favorite3) {
            this.favorite3 = favorite3;
        }

        public S getFavorite3(S arrayList) {
            return (this.favorite3);

        }


    }
}
