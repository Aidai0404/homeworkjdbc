public class Main {
    public static void main(String[] args) {
//        int a=1;
//        for (int i = 1; i <=10; i++) {
//            a=a*i;
//            System.out.println(a);
//        }
//        int b=10;
//        for (int i = 1; i < b; i++) {
//            b*=i;
//            System.out.println(b);
//
//        }

        int[] testArr = new int[]{6,3,8,2,6,9,4,11,1};
        bubbleSort(testArr);
        for (int i : testArr) {
            System.out.println(i);
        }
    }

    public static void  bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) { //
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}