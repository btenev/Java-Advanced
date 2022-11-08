import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class P4_Applied_Arithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(e ->  e += 1).toArray();
        Function<int[], int[]> subtract = arr -> Arrays.stream(arr).map(e ->  e -= 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(e ->  e *= 2).toArray();
        Consumer<int[]> printer = arr -> Arrays.stream(arr).forEach(e -> System.out.println(e + " "));

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    num = add.apply(num);
                    break;
                case "subtract":
                    num = subtract.apply(num);
                    break;
                case "multiply":
                    num = multiply.apply(num);
                    break;
                case "print":
                    printer.accept(num);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
