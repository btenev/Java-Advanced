import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P3_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sentence = scanner.nextLine().split(" ");

        Predicate<String> filterUppercaseWords = x -> Character.isUpperCase(x.charAt(0));

        List<String> sorted = Arrays.stream(sentence).filter(filterUppercaseWords).collect(Collectors.toList());

        System.out.println(sorted.size());
//        sorted.forEach(System.out::println);
        System.out.println(String.join(System.lineSeparator(), sorted));
//        System.out.println(String.join("/n", sorted));


    }
}
