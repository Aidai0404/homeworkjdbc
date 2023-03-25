import java.util.function.UnaryOperator;



public class Main {
    public static void main(String[] args) {

        System.out.println(sqrt().apply(36.0));
    }

    public  static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double> sqr = (double2)->Math.sqrt(double2);

        return sqr;
    }
}