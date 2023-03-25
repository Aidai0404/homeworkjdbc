import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Teacher teacher = new Teacher("Нурпери", 1234567);
//        Student student=new Student("\nАйдай",1234234);
//        EnglishCourse encglish=new EnglishCourse(teacher.getName(), student.getName(), teacher.getId(), student.getId(), 1,16,"English\n");
//        System.out.println(encglish);
//        ITcourse it=new ITcourse(teacher.getName(), student.getName(), teacher.getId(), student.getId(), 1,16,"Java");
//        System.out.println(it);

//        int [] array=new int [150];
//        Random rm=new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i]= rm.nextInt(10,100);
//            if(array[i]%10==9)
//            System.out.println(array[i]);


//        int a=10;
//        int count=0;
//        for (int i = 1; i < a; i++) {
//          count+=i;
//            System.out.println(count);
      //  }

int [] array={1,2,3,4,6,2,-7};
int target=9;
int sum=0;
        for (int i = 0; i < array.length ; i++) {
            sum+=array[i];
            array[i]+=sum;
            if(sum==target){
                System.out.println("yes");
            }else{
                System.out.println("nope");
            }


            }

        }


    }

