import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P4_Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<Character, Integer> symbolDatabase = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            symbolDatabase.putIfAbsent(currentSymbol, 0);
            int counter = symbolDatabase.get(currentSymbol) + 1;
            symbolDatabase.put(currentSymbol, counter);
        }
        symbolDatabase.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry ->{
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        });
    }
}
