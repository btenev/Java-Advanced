import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P6_Find_Evens_or_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        String condition = scanner.nextLine();
        Predicate<Integer> oddOrEven = condition.equals("even")
                ? n -> n % 2 == 0
                : n -> n % 2 != 0;
        printNumbersIn(range[0], range[1], oddOrEven);
    }
    private static void printNumbersIn(int startInclusive, int endExclusive, Predicate<Integer> predicate) {
        System.out.println(IntStream.rangeClosed(startInclusive, endExclusive)
                .boxed()
                .filter(predicate)
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));

    }
}
