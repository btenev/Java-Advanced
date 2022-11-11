package P6_Generic_Count_Method_Double;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();
        for (int i = 0; i < n; i++) {
            Double current = Double.valueOf(scanner.nextLine());
            box.add(current);
        }
        Double elementToCompare = Double.valueOf(scanner.nextLine());
        int count = box.returnCountOfGreaterElements(elementToCompare);
        System.out.println(count);
    }
}
