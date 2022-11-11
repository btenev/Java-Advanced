package P8_Custom_List_Sorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Box<String> box = new Box<>();
        while (!input.equals("END")) {
            String command = input.split(" ")[0];
            switch (command) {
                case "Add":
                    String element = input.split(" ")[1];
                    box.add(element);
                    break;
                case "Remove":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    box.remove(index);
                    break;
                case "Contains":
                    String elementToCheck = input.split(" ")[1];
                    System.out.println(box.contains(elementToCheck));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(input.split(" ")[1]);
                    int secondIndex = Integer.parseInt(input.split(" ")[2]);
                    box.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String elementToCompare = input.split(" ")[1];
                    int count = box.countGreaterThan(elementToCompare);
                    System.out.println(count);
                    break;
                case "Max":
                    System.out.println(box.getMax());
                    break;
                case "Min":
                    System.out.println(box.getMin());
                    break;
                case "Sort":
                    Sorter.sort(box);
                    break;
                case "Print":
                    System.out.print(box);
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
