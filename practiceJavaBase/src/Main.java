import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[]ints = {1,2,3,9,10,6};
        //max of array
     /*   int max = ints[0];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]>max){
                max=ints[i];
            }
        }
        System.out.println(max);*/

        //sum of numbers in array
//        int sum = 0;
//        for (int i = 0; i < ints.length; i++) {
//            sum+=ints[i];
//        }
//        System.out.println(sum);
//
//        //Scanner
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt()+1;
//        System.out.println(a);
//        int n = 10;
//        int sum = 0;
//        double pie = 3.14;
//
//        for (int var = 1; var < n; var = var + 3) {
//            System.out.println("Pie: " + pie);
//            for (int j = 1; j < n; j = j + 2) {
//                sum++;
//            }
//            System.out.println("Sum = " + sum);
//        }

//        int a = 1;
//        int b = 3;
//        int c = a;
//        a = b;
//        b = c;
//        System.out.println(a);
//        System.out.println(b);
//
//
//
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = 0; j < ints.length; j++) {
//                if(ints[j]<ints[j+1]){
//                   int swap = ints[j];
//                   ints[j] = ints[j+1];
//                   ints[j+1] = swap;
//                }
//            }
//        }


        List<String>list = new ArrayList<>();
        list.add("milk");
        list.add("sausage");
        Stream<String>stream = list.stream();
        list.add("eegs");
        stream.forEach(System.out::println);

        Map<String, String>map = new HashMap<>();
        map.put(null,"Test");
        map.put(null,"Fest");
        System.out.println(map);

        List<Float>floats = new ArrayList<>();
        System.out.println(floats.getClass());
        Thread m = new Thread();
        Thread.currentThread()
    }
}