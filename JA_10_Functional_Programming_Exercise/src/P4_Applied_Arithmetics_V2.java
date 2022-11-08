import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class P4_Applied_Arithmetics_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split(" ");
        String command = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(num)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<Integer> add = d -> d + 1;
        UnaryOperator<Integer> subtract = d -> d - 1;
        UnaryOperator<Integer> multiply = d -> d * 2;
        Consumer<Integer> printer = s -> System.out.print(s + " ");

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = numbers.stream().map(add).collect(Collectors.toList());
                    break;
                case "subtract":
                    numbers = numbers.stream().map(subtract).collect(Collectors.toList());
                    break;
                case "multiply":
                    numbers = numbers.stream().map(multiply).collect(Collectors.toList());
                    break;
                case "print":
                    numbers.forEach(printer);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
