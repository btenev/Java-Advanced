import java.util.LinkedHashMap;
import java.util.Scanner;

public class P6_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> resourceQuantity = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String metal = input;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resourceQuantity.containsKey(metal)) {
                int newQuantity = resourceQuantity.get(metal) + quantity;
                resourceQuantity.put(metal, newQuantity);
            } else {
                resourceQuantity.put(metal, quantity);
            }
            input = scanner.nextLine();
        }
        resourceQuantity.forEach((key, value)-> System.out.println(key + " -> " + value));
    }
}
