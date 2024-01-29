public class Array {

    private int[]array;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int max(int[]array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[]array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }
    public int pow(int a, int b){  // 2, 3
        int result = 1; //2 //4 //8
        for (int i = 1; i <= b; i++) {
            result*=a;
        }
        return result;
    }



}
