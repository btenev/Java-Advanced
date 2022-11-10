package P1_Opinion_Poll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Person> listOfPeople = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            listOfPeople.add(person);

        }
        Predicate<Person> filter = p -> p.getAge() > 30;
        listOfPeople
                .stream()
                .filter(filter)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(e -> System.out.println(e.getName() + " - " + e.getAge()));
    }
}
