import java.util.*;
import java.util.stream.Collectors;

public class P8_Custom_Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //even - left   odd - right
        Comparator<Integer> comparator= ((firstDigit, secondDigit) -> {
            // first == even  && second == odd;
            if (firstDigit % 2 == 0 && secondDigit % 2 != 0) {
                return -1;
            // first == odd  &&  second == even;
            } else if (firstDigit % 2 != 0 && secondDigit % 2 == 0) {
                return 1;
            // first == even && second == even  ||  first == odd && second == odd;
            } else {
                return firstDigit.compareTo(secondDigit);
            }
        });
        nums.stream().sorted(comparator).forEach(e -> System.out.print((e) + " "));
    }
}
