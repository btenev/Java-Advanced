import java.util.Scanner;
import java.util.function.Consumer;

public class P1_Consumer_Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        String[] collection = input.split(" ");
        // is void Interface
//        Consumer<String> printer = System.out::println;
 //       Arrays.stream(collection).forEach(e -> printer.accept(e));

        //Consumer<String> printer = p -> Arrays.stream(p.split(" ")).forEach(System.out::println);
        //printer.accept(input);

       Consumer<String[]> printer = arr -> {
           for (String s : arr) {
               System.out.println(s);
           }
       };
       printer.accept(collection);
    }
}
