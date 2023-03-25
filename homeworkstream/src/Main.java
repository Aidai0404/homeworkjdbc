import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1, 8, 3, 4, 5, 6, 5};
        Double arr = Double.valueOf(Stream.of(ints).filter(c -> c % 2 == 0).map(c -> c * c)
                .max((x, y) -> Integer.compare(x, y)).get());
        System.out.println(arr);

        Supplier<Stream<Integer>> streamSupplier = () -> Stream.of(ints);
        Optional<Double> integer = streamSupplier.get().map(c -> Math.pow(c, 2)).max(Comparator.naturalOrder());
        System.out.println(integer);
        Optional<Double> doubleOptional = streamSupplier.get().map(c -> Math.pow(c, 2)).min(Comparator.naturalOrder());
        System.out.println(doubleOptional);
        int a = 2;
        int b = 5;
        Stream.of(a * b).forEach(System.out::println);

        Map<String, String> fruits = Stream.of("apple", "banana", "lemon", "orange")
                .collect(Collectors.toMap(e -> e.substring(0, 1), e -> e));
        System.out.println(fruits);
        Stream.of("apple", "orange")
                .map(String::toUpperCase).forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5, 6)
                .peek(e -> System.out.println("number " + e)).collect(Collectors.toList());
        Integer[] integers = {1, 2, 3, 4};
        int integer1 = Stream.of(integers).map(x -> x * 2).collect(Collectors.toList()).get(2);
        System.out.println(integer1);
        Stream.of(integers).map(x -> x * 2);

        System.out.println(Stream.of(integers).collect(Collectors.toList()));
        int[] ints1 = {1, 2, 3};
        System.out.println(ints1[1]);
        aid();
        aid();
        aid();
        String abc="Aidai";
        System.out.println(abc.substring(2));
        System.out.println(abc.contains("dai"));
        System.out.println(abc.replace("A","b"));
        System.out.println(abc.concat("ai"));

        Map<Long,String>acc = new HashMap<>();
    }
    public static void aid(){
        System.out.println("aid");
    }
}