import java.util.*;

public class P6_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        // Arrays.stream(scanner.nextLine().split("\\s+")).forEach(queue::offer);
        // Collections.addAll(queue, children);
        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                String currentChild = queue.poll();
                queue.offer(currentChild);
            }
            String removeChild = queue.poll();
            System.out.println("Removed " + removeChild);
        }
        System.out.println("Last is " + queue.peek());
    }
}
