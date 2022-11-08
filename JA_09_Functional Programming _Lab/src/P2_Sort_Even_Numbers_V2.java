import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P2_Sort_Even_Numbers_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers
                .stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        // със функция
        Function<Stream<Integer>, String> mutator = x -> x.map(String::valueOf)
                .collect(Collectors.joining(", "));


        String firstOutput = mutator.apply(evenNumbers.stream());
        System.out.println(firstOutput);

        List<Integer> sorted = evenNumbers
                .stream()
                .sorted()
                .collect(Collectors.toList());

        String secondOutput = mutator.apply(sorted.stream());
        System.out.println(secondOutput);

    }
}
