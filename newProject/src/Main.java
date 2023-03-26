import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int [] array = new int[10];
        Random rm = new Random();
        int max = array[0];
        // можно и до заполнения массива
        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(10)+10;
            System.out.println(array[i]);
        }
        int min = array[0];
        //после заполнения массива!!!
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
            if(array[i]<min){
                min=array[i];
            }
        }

        System.out.println(min + "is min value ");
        System.out.println(max + "is max value");

        List<Integer> set = new ArrayList<>();
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                int before = 0;
//                if (array[i] > array[j]) {
//                    before = array[i]; //
//                    array[i] = array[j];
//                    array[j] = before;
//                }
//            }
//        }

        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        //    System.out.println(set.get(i));
        }
        Set<Integer>set1 = new LinkedHashSet<>();
        for (int i = 0; i < set.size(); i++) {
            set1.add(set.get(i));
        }
        for(Integer i : set1){
            System.out.println(i);
        }
//        for (int k = 0; k < set.size(); k++) {
//        for (int i = 0; i < set.size(); i++) {
//            for (int j = i + 1; j < set.size(); j++) {
//                    if (set.get(j) == set.get(i)) {
//                        set.remove(set.get(j));
//                    }
//                }
//
//            }
//            System.out.println(set.get(k));
//        }
    }
}