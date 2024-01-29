public class Solution implements SolutionService{
    @Override
    public void runningSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i]+=array[i-1];
            System.out.println(array[i]);
        }
    }

    @Override
    public void runningSum2(int[] array) {
        for (int i = 0; i < array.length;) {
            for (int j = i+1; j < array.length; j++) {
                array[i]+=array[j];
                System.out.println(array[i]);
            }
            break;
        }
    }
}
