import java.util.ArrayDeque;
import java.util.Scanner;

public class P5_Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (!queue.isEmpty()) {
                    System.out.println("Canceled " + queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                queue.offer(command);
            }

            command = scanner.nextLine();
        }
//        for (String current : queue) {
//            System.out.println(current);
//        }
        queue.forEach(System.out::println);
    }
}
