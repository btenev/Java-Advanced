import java.util.Scanner;
import java.util.TreeSet;

public class P2_SoftUni_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeSet<String> regular = new TreeSet<>();
        TreeSet<String> vip = new TreeSet<>();
        while (!input.equals("PARTY")) {
            String guest = input;
            char firstSymbol = guest.charAt(0);
            if (Character.isDigit(firstSymbol)) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }
            input = scanner.nextLine();
        }
        String guestArrival = scanner.nextLine();
        while (!guestArrival.equals("END")) {
            vip.remove(guestArrival);
            regular.remove(guestArrival);
            guestArrival = scanner.nextLine();
        }
        int guestSum = vip.size() + regular.size();
        System.out.println(guestSum);

        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
//        System.out.println(vip.size() + regular.size());
//        System.out.print(vip.stream().collect(Collectors.joining(System.lineSeparator())));
//        System.out.println(regular.stream().collect(Collectors.joining(System.lineSeparator())));
    }
}
