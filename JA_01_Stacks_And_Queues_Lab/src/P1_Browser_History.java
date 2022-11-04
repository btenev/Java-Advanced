import java.util.ArrayDeque;
import java.util.Scanner;

public class P1_Browser_History {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> urlDatabase = new ArrayDeque<>();
        String currentUrl = "";
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!urlDatabase.isEmpty()) {
                    currentUrl = urlDatabase.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
                if (!currentUrl.isEmpty()) {
                    urlDatabase.push(currentUrl);
                }
                currentUrl = input;
            }
            System.out.println(currentUrl);

            input = scanner.nextLine();
        }
    }
}
