public class Person2 <T,E>{
    T age;
    E name;


    public Person2(T age, E name) {
        this.age = age;
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public static  <T extends Number> void maximum(T[] numbers){
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max((int)numbers[i], max);
        }
        System.out.println(max);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
