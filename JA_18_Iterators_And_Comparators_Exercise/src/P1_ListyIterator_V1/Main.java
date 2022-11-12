package P1_ListyIterator_V1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ListyIterator listyIterator = null;

        while (!input.equals("END")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "Create":
                    if (tokens.length > 1) {
                        listyIterator = new ListyIterator(Arrays.copyOfRange(tokens, 1,tokens.length));
                    } else {
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    boolean move = listyIterator.move();
                    System.out.println(move);
                    break;
                case "HasNext":
                    boolean hasNext = listyIterator.hasNext();
                    System.out.println(hasNext);
                    break;
                case "Print":
                    try {
                        listyIterator.print();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
