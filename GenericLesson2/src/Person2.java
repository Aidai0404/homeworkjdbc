public class Person2 <T,Y>{
    private T value;
    private Y value2;

    public Person2(T value, Y value2) {
        this.value = value;
        this.value2 = value2;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Y getValue2() {
        return value2;
    }

    public void setValue2(Y value2) {
        this.value2 = value2;
    }

    public static <T extends Number> void maximum(T[]massive){
        int max = 0;
        for (int i = 0; i < massive.length; i++) {
            max = Math.max((int) massive[i], max);
        }
        System.out.println(max);
    }

    @Override
    public String toString() {
        return "Person2{" +
                "value=" + value +
                ", value2=" + value2 +
                '}';
    }
}
