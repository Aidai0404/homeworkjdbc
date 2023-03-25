import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set <Integer> set2 = new HashSet<>();
        set1.add(0);
        set1.add(2);
        set1.add(1);



        System.out.println(symmetricDifference(set1,set2));


    }
    public  static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        for (int i = 0; i < set1.size(); i++) {
            for (int j = 0; j < set2.size(); j++) {
                if (set1.add(i) == set2.add(j)) {
                    set1.remove(i);
                    set2.remove(j);
                }
            }

        } return set1;
    }}