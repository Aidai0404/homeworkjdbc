import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Generic <L> {
    public void method(L[] type) {
        System.out.println(type[0]);
        System.out.println(type[type.length-1]);
        System.out.println(Arrays.toString(type));
    }

}