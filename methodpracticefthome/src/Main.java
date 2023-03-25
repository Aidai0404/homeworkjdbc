public class Main {
    public static void main(String[] args) {
       /* 1. Создайте метод, который будет принимать в
        параметр 2 цифры и должен вывести на консоль
        среднее арифметическое значение.*/
       /* aidai(5,7);


    }
    static void aidai(int a,int b){
        System.out.println((a+b)/2d);*/

        /*2. Создайте метод, который будет принимать в
параметр массив и метод должен вывести на
консоль все элементы этого массива.

        aidayuu(new int[]{1,2,3,4,5});

    }

    static void aidayuu(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);


        }*/

        /* 3. Создайте метод который будет принимать в
параметр цифру и выведет на консоль столько *
сколько вы зададите в параметр.*/
       /* aidusik(4);

    }
    static void aidusik(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("*");

        }*/

        //Homework
        /*Параметрине массив алган эки метод жазыныз, бириси массивдин
эн кичине элементин тапса, экинчиси эн чон элементин
табат жана консолго чыгарат.
Мисалы:
Массив: 1 8 3 3 4 4 9 12
Минимальный элемент: 1
Максимальный элемент: 12*/
        aid(4, 1, 5);
    }

        static void aid ( int a, int b, int c){
            int array[] = {a, b, c};
            int n=0;

            for (int i = 0; i < array.length; i++) {
                n=Math.max(array[i],n);

            } System.out.println(n);
            int min = array.length;
            for (int i = 0; i < array.length; i++) {

                min=Math.min(array[i],min);

            } System.out.println(min);
        }
    }



