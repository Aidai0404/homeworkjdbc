package Generic;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer>max2=new ArrayList<>();
        max2.add(1);
        max2.add(3);
        max2.add(5);
//        Random rm=new Random();
//
//        for (int i = 0; i < max1.size(); i++) {
//            int rmint= rm.nextInt(1,100);
//            max1.add(rmint);
//        }
        Generic<Integer,String> max=new Generic<>(max2,"Aidai");
        System.out.println(max.method(max2));


    }
}
