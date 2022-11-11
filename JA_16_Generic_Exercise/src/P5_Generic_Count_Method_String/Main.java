package P5_Generic_Count_Method_String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String current = scanner.nextLine();
            box.add(current);
        }
        String elementToCompare = scanner.nextLine();
        int count = box.returnCountOfGreaterElements(elementToCompare);
        System.out.println(count);

    }


}
