package P2_Generic_Box_of_Integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<Integer> box = new Box<>();

        for (int i = 0; i < n; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            box.add(current);
        }
        System.out.println(box);
    }
}
