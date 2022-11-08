import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P6_Predicate_For_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        Predicate<String> validLength = s -> s.length() <= n;

        Arrays.stream(input).filter(validLength).forEach(System.out::println);
    }
}
