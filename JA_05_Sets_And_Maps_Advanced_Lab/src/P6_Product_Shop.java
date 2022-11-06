import java.util.*;

public class P6_Product_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Map<String, Double>> productDatabase = new HashMap<>();
        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            productDatabase.putIfAbsent(shop, new LinkedHashMap<>());
            Map<String, Double> productPrices = productDatabase.get(shop);
            productPrices.put(product, price);

            input = scanner.nextLine();
        }
        productDatabase.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach((entry) -> {
                    System.out.println(entry.getKey() + "->");
                    Map<String, Double> productPrice = entry.getValue();
                    productPrice.forEach((key, value) -> {
                        System.out.print("Product: " + key + ", ");
                        System.out.printf("Price: %.1f", value);
                        System.out.println();
                    });

                });
    }
}
