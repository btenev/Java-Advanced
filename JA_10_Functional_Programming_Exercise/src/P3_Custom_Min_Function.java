import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class P3_Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        Function<List<Integer>,Integer> getMin = list -> Collections.min(list);
//        System.out.println(getMin.apply(numbers));

        Consumer<List<Integer>> printMin = list -> System.out.println(Collections.min(list));

        printMin.accept(numbers);
    }
}
