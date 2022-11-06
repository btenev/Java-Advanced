import java.util.LinkedHashSet;
import java.util.Scanner;

public class P1_Unique_Usernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> nameCollection = new LinkedHashSet<>();

        while (n-- >= 1) {
            String name = scanner.nextLine();
            nameCollection.add(name);
        }
        nameCollection.forEach(System.out::println);
    }
}
