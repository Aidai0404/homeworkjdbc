import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(3, 2, "Murka"));
        cats.add(new Cat(4, 1, "Tom"));
        cats.add(new Cat(2, 5, "Mila"));
        cats.add(new Cat(5, 2, "Jenny"));

        getByName(cats, "Murka");
        getByAge(cats, 2);
    }

    public static void getByName(ArrayList<Cat> cats, String name) {
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getName().equals(name)) {
                System.out.println(cats.get(i));
            }
        }
    }

    public static void getByAge(ArrayList<Cat> cats, int age) {
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getAge() == age) {
                System.out.println(cats.get(i));
            }
        }
    }
}

