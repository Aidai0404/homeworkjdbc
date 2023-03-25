public class Main {
    public static void main(String[] args) {

        System.out.println(aid(new int[]{8, 9, 3, 4, 5, 6, 7, 8}));
    }

    //    static String aid(int a) {
//        if (a % 2 != 0) {
//            return "nechetnoe";
//        }else{
//            return "chetnoe";
//    }
    static  int aid(int ai[]) {
        int b=ai.length;
        for (int i = 0; i < ai.length; i++) {
            b = Math.min(ai[i], b);
        }
        return b;

    }

}