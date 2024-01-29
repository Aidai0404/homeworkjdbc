import java.util.ArrayList;

public class Generic <T,V>{

    private T name;
    private V age;

    public Generic(T name, V age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public <A> void genericMethod(ArrayList<A>list){
        System.out.println(list);
    }

    public <T extends Number> void method(T[]array){
        for(T t : array){
            System.out.println(t);
        }
    }

    public static <T extends Comparable> T maximum(T[]array){
        T max = array[0];
        for(T t : array){
            if(t.compareTo(max)>0){
                max = t;
            }
        }
        return max;
    }


    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
