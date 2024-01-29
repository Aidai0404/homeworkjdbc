public class Box1 <T>{
        private T name;

    public Box1(T name) {
        this.name = name;
    }

    public static <T> Box1<T> method(Box1 <T> box) {
            System.out.println(box);
            return box;
        }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Box1{" +
                "name=" + name +
                '}';
    }
}
