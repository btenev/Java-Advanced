import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P2_Sum_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Function <String, Integer> countIntInString = x -> x.split(", ").length;
        Function<String, Integer> sumString = x -> Arrays
                .stream(x.split(", "))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println("Count = " + countIntInString.apply(input));
        System.out.println("Sum = " + sumString.apply(input));

    }
}
