import java.util.Set;

public class Main {
    public static void main(String[] args) {
       int[]ints = {9,5,2,7,6,0};
       int[]array = ints(ints);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[]ints(int[]ints){
        for (int i = 0; i < ints.length; i++) {
            for (int j = 1; j < ints.length; j++) {
                if(ints[j]<ints[j-1]){
                    int min = ints[j];
                    ints[j]=ints[j-1];
                    ints[j-1]=min;
                }
            }
        }
        return ints;
    }
}