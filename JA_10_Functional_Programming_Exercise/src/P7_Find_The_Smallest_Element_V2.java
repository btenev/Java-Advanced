import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P7_Find_The_Smallest_Element_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> num = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestElement = list -> {
            int min = Integer.MAX_VALUE;
            int indexMin = 0;
            int index = 0;
            for (Integer integer : list) {
                if (integer <= min) {
                    min = integer;
                    indexMin = index;
                }
                index++;
            }
            return indexMin;
        };
        int index = smallestElement.apply(num);
        System.out.println(index);
    }
}