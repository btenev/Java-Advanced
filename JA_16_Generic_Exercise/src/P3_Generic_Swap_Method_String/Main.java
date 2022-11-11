package P3_Generic_Swap_Method_String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            box.add(element);
        }
        int elementIndex = scanner.nextInt();
        int elementNewIndex = scanner.nextInt();

        box.swap(elementIndex, elementNewIndex);

        System.out.println(box);
    }
}
