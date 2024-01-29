public class Generic <E,T>{
    private E name;
    private T age;

    public Generic(E name, T age) {
        this.name = name;
        this.age = age;
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public <T extends Comparable> T maximum(T[]max){
         T maxSan = max[0];
        for (T element : max) {
            if(element.compareTo(maxSan)>0){
                maxSan=element;
            }
        }
        return maxSan;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
