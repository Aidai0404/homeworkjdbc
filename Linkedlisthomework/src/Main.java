import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random rm=new Random();
        for (int i = 0; i < 10; i++) {
            int randomint= rm.nextInt(0,1);
            integers.add(randomint);
        }
        sortInt(integers);



        LinkedList<Integer> ints = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            int rmlist=rm.nextInt(0,1);
            ints.add(rmlist);
        }
        sortInt(ints);

        int [] array=new int[10];
        for (int i = 0; i < array.length; i++) {
         array[i]=rm.nextInt(0,1);
            Arrays.sort(array);
        }
        sortInt(array);


    } public static void sortInt(ArrayList<Integer> integers){
        Collections.sort(integers);
        System.out.println(integers);
        }
        public static void sortInt(LinkedList<Integer>ints){
        Collections.sort(ints);
            System.out.println(ints);
        }
        public static void sortInt(int[] array){
            System.out.println(Arrays.toString(array));
        }
    }

