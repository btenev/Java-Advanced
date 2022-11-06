import java.util.*;

public class P3_Periodic_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        HashSet<String> uniqueElements = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            String[] elements = scanner.nextLine().split(" ");
// начин 1:
//            for (String element : elements) {
//                uniqueElements.add(element);
//            }
// начин 2:
//        Collections.addAll(uniqueElements, elements);
// начин 3:
          uniqueElements.addAll(List.of(elements));
        }
        uniqueElements.stream().sorted().forEach(e -> System.out.print(e + " "));
    }
}
