import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P7_Cities_by_Continent_and_Country {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, ArrayList<String>>> continentDatabase = new LinkedHashMap<>();
        //       while (n-- > 0)
        for (int i = 1; i <= n; i++) {
            String[] geographicalLocations = scanner.nextLine().split(" ");
            String continent = geographicalLocations[0];
            String country = geographicalLocations[1];
            String city = geographicalLocations[2];

            continentDatabase.putIfAbsent(continent, new LinkedHashMap<>());
            Map<String, ArrayList<String>> countries = continentDatabase.get(continent);
            countries.putIfAbsent(country, new ArrayList<>());
            ArrayList<String> cityList = countries.get(country);
            cityList.add(city);
        }
        continentDatabase.entrySet()
                .forEach(e -> {
                    System.out.println(e.getKey() + ":");

                    e.getValue().entrySet()
                            .forEach(element ->
                            System.out.println("  " + element.getKey() + " -> "
                                    + String.join(", ", element.getValue())));
                });
    }
}
