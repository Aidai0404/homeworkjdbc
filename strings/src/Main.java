public class Main {
    public static void main(String[] args) {
      StringBuilder builder=new StringBuilder();
      int [] numbers={1,2,3,4,5};
      for(int num:numbers){
          builder.append(num);
      }
        System.out.println(builder);

    }
}