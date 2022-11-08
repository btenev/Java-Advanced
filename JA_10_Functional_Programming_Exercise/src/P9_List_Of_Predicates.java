import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class P9_List_Of_Predicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] sequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        IntPredicate divisibleBySequence = e -> {
            for (int digit : sequence){
                if (e % digit != 0) {
                    return false;
                }
            }
            return true;
        };

        IntStream
                .rangeClosed(1,n)
                .filter(divisibleBySequence)
                .forEach( e -> System.out.print(e + " "));
    }
}
