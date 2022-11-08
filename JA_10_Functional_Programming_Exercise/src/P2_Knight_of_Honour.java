import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P2_Knight_of_Honour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split(" ");

        Consumer<String> printModifiedName = p -> System.out.println("Sir " + p);

        Arrays.stream(names).forEach(printModifiedName);
    }
}
