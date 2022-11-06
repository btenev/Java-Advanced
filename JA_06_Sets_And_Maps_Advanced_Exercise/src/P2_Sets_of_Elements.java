import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class P2_Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstSetRange =n[0];
        int secondSetRange =n[1];
        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();
//        LinkedHashSet<Integer> duplicateSet = new LinkedHashSet<>();
        for (int i = 0; i < firstSetRange; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        } for (int j = 0; j < secondSetRange; j++) {
            int num = Integer.parseInt(scanner.nextLine());
            secondSet.add(num);
        }
//        for (Integer current : firstSet) {
//            if (secondSet.contains(current)){
//                duplicateSet.add(current);
//            }
//        }
//        duplicateSet.forEach(e -> System.out.print(e + " "));
        firstSet.retainAll(secondSet);
        firstSet.forEach(e -> System.out.print(e + " "));
    }
}
