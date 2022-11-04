import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P2_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, tokens);

        while (stack.size() > 1) {
            int firstDigit = Integer.parseInt(stack.pop());
            String operation = stack.pop();
            int secondDigit = Integer.parseInt(stack.pop());
            switch (operation) {
                case "+":
                    stack.push(String.valueOf(firstDigit + secondDigit));
                    break;
                case "-":
                    stack.push(String.valueOf(firstDigit - secondDigit));
                    break;
            }
        }
        /* System.out.println(String.join("", stack)); */
        System.out.println(stack.pop());
    }
}
