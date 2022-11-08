import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P7_Find_The_Smallest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//        Consumer<List<Integer>> printIndexOfMinElement = list -> {
//            int minNum = Collections.min(list);
//            int minIndex = list.lastIndexOf(minNum);
//            System.out.println(minIndex);
//        } ;
//        printIndexOfMinElement.accept(numbers);
        Function<List<Integer>, Integer> minIndex = list -> list.lastIndexOf(Collections.min(list));
        System.out.println(minIndex.apply(numbers));
    }
}
