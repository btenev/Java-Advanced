import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashSet<String> carNumDatabase = new LinkedHashSet<>();
        while (!input.equals("END")) {
            String[] tokens = input.split(",\\s+");
            String command = tokens[0];
            String registrationNum = tokens[1];
            switch (command) {
                case "IN":
                    carNumDatabase.add(registrationNum);
                    break;
                case "OUT":
                    carNumDatabase.remove(registrationNum);
                    break;
            }
            input = scanner.nextLine();
        }
//        if (carNumDatabase.isEmpty()) {
//            System.out.println("Parking Lot is Empty");
//        } else {
//            for (String carNum : carNumDatabase) {
//                System.out.println(carNum);
//            }
//        }
        String output = carNumDatabase.isEmpty()
                ? "Parking Lot is empty"
                : carNumDatabase.stream().collect(Collectors.joining(System.lineSeparator()));
        System.out.println(output);
    }
}
