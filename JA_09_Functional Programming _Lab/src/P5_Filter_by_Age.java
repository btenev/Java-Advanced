import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P5_Filter_by_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Supplier<Person> personSupplier = () -> {
            String[] tokens = scanner.nextLine().split(", ");
            return new Person(tokens[0], Integer.parseInt(tokens[1]));
        };

        List<Person> listOfPeople = IntStream.range(0, n)
                .mapToObj(ignored -> personSupplier.get())
                .collect(Collectors.toList());

        String conditionParam = scanner.nextLine();
        int ageLimit = Integer.parseInt(scanner.nextLine());
        String[] format = scanner.nextLine().split(" ");

        Predicate<Person> filtered = getFilter(conditionParam, ageLimit);
        Consumer<Person> print = getPrinter(format);

        listOfPeople
                .stream()
                .filter(filtered)
                .forEach(print);
    }

    private static Predicate<Person> getFilter(String conditionParam, int ageLimit) {
        return conditionParam.equals("older")
                ? p -> p.age >= ageLimit
                : p -> p.age <= ageLimit;
    }

    private static Consumer<Person> getPrinter (String[] format) {
        if (format.length == 2) {
            return p -> System.out.println(p.name + " - " + p.age);
        } else if (format[0].equals("name")) {
            return p -> System.out.println(p.name);
        }
        return p -> System.out.println(p.age);
    }

    public static class Person {
        private final String name;
        private final int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
