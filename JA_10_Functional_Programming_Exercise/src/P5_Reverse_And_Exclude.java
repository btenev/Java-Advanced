import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P5_Reverse_And_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int divisibleBy = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);
 //       Predicate<Integer> filtered = i -> i % divisibleBy != 0;
        Predicate<Integer> removeIf = i -> i % divisibleBy == 0;
//        String finalRes = numbers.stream()
//                .filter(filtered)
//                .map(String::valueOf)
//                .collect(Collectors.joining(" "));
//        System.out.println(finalRes);

        numbers.removeIf(removeIf);
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
