public class Person1 {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "value='" + value + '\'' +
                '}';
    }
}
