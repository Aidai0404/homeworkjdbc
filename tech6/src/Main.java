import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* int san = sc.nextInt();
        for(int i=1; i<=san;i++){
            System.out.println(i);
        }*/
        /*int b = 5;
        for(int i=1;i<=b;i++){
            System.out.println(i*b);

        }*/
       /* }
        int a = 0;
        while (a<10){
            System.out.println("hello");
        }*/
       /* int a = 2;
        for(int i=1;i<=10;i++){
            int s = (int) Math.pow(a,i);
            System.out.printf("\n%d^%d = %d",a,i,s);
        }*/

       /* for(int i=10;i>1;i--){
            System.out.println(i*1);
        }*/
        /*for (int i =1;i<=10;i+=2){
            System.out.println(i*i);
        }*/
        /* int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = a; i<=b;i++){
            if(i%2!=0) {
                count += i;
            }


        }
        System.out.println(count);*/
        /* int a = sc.nextInt();
        for(int i=a;i>0;){
            if(a!=0){
                a+=i;
                i--;
                System.out.println(i);
            }
        }*/


       /* int a = sc.nextInt();//5
        int sum=0;//0
        int count=0;
        while (true) {
            if (a==0) {
                break;}
                sum=a+sum;//5+4+3
                a= sc.nextInt();//4
                count++;


            }

        double c =(double) sum/count;
        System.out.println(sum);
        System.out.println(count);
        System.out.println(c);*/
/*int a = sc.nextInt();
int sum = 0;
        int count=0;
        while (a>0) {
            sum=a+sum;//5+4+3
            a= sc.nextInt();//4
            count++;


        }

        double c =(double) sum/count;
        System.out.println(sum);
        System.out.println(count);
        System.out.println(c);*/

        //PRACTICE

       /* for (int i = 1; i <=10; i++) {
            int b = i*3;
            System.out.printf("\n%d*%d=%d",i,3,b);

        }*/

        /*for (int i = 0; i <3; i++) {
            System.out.println("****");
            
        }*/
        System.out.println("Автобуска окшош бирок электро энергия менен журот");
        System.out.println("бул эмне?");
        boolean joop = false;
        for (int i= 0;true; i++) {
            if(joop=true){
                break;
            }
            String a = sc.nextLine();
            switch (a) {
                case "Троллейбус":
                    System.out.println("Туура азаматсын");
                    joop=true;
                    break;

                case "Автобус":
                    System.out.println("Туура эмес");
                    break;

                case "билбейм":
                    System.out.println("Туура жооп - троллейбус");
                    joop=true;
                default:
                    System.out.println("дагы ойлонуп коюнуз");

            }
        }

    }
}

