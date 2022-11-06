import java.util.LinkedHashMap;
import java.util.Scanner;

public class P7_Fix_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, String> userDatabase = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();
//            int lastDot = email.lastIndexOf(".");
 //           String domain = email.substring(lastDot);

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                userDatabase.put(name, email);
            }
            input = scanner.nextLine();
        }
        userDatabase.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
