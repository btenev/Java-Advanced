import java.util.*;

public class P4_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> numberDatabase = new LinkedHashMap<>();
        for (Double number : numbers) {
            numberDatabase.putIfAbsent(number, 0);
            numberDatabase.put(number, numberDatabase.get(number) + 1);
        }
        numberDatabase.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));
    }
}
