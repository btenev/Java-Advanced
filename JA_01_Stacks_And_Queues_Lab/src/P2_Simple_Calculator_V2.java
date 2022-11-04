import java.util.*;

public class P2_Simple_Calculator_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        /* for (String token : tokens) {
            stack.push(token);
        }  */

        Arrays.stream(tokens).forEach(stack::push);

        // how to reverse?
    }
}
