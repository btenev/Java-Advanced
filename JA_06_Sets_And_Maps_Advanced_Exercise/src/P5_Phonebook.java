import java.util.HashMap;
import java.util.Scanner;

public class P5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String, String> phonebook = new HashMap<>();

        while (!input.equals("search")) {
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phoneNum = tokens[1];
            phonebook.put(name, phoneNum);
            input = scanner.nextLine();
        }
        String instruction = scanner.nextLine();
        while (!instruction.equals("stop")) {
            String name = instruction;
            if (phonebook.containsKey(name)){
                System.out.println(name + " -> " + phonebook.get(name));
            } else {
                System.out.println("Contact " + name +" does not exist.");
            }
            instruction = scanner.nextLine();
        }
    }
}
