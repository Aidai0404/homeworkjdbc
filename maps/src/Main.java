import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Integer>yearsBirth=new HashMap<>();
        int min=2010;
        int max=2020;

        for (int i = min; i <=max; i++) {
            yearsBirth.put(i,0);}
        int birthday=0;
            Random rm=new Random();
                for (int j = 0; j < 100; j++) {
                birthday=rm.nextInt(min,max);
                for(Map.Entry<Integer, Integer> hashmap: yearsBirth.entrySet()){
                    if(hashmap.getKey()==birthday){
                        hashmap.setValue(hashmap.getValue()+1);
                    }}
                }
            int maxvalue=0;
             for(Map.Entry<Integer,Integer> maps: yearsBirth.entrySet()){
                 maxvalue=Math.max(maxvalue,maps.getValue());
                System.out.println(maps);
                 System.out.println("\n"+maxvalue);







        }

    }
}