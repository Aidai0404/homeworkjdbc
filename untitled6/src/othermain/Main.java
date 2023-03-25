package othermain;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set1=new HashSet<>();
        set1.add(0);
        set1.add(2);
        set1.add(1);
        set1.add(3);
        set1.add(4);

        Set<Integer>set2=new HashSet<>();
        set2.add(0);
        set2.add(5);
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println(symmetricDifference(set2,set1));

    }
    public static  Set<Integer>symmetricDifference(Set<Integer>set2,Set<Integer>set1) {
        Set<Integer>symmDiff=new HashSet<>(set2);
        symmDiff.addAll(set1);
        Set<Integer> tmp = new HashSet<Integer>(set2);
        tmp.retainAll(set1);
        symmDiff.removeAll(tmp);
        return symmDiff;
}}
