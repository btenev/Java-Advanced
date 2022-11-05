import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P2_Positions_Of_V2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimension = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimension[0]);
        int column = Integer.parseInt(dimension[1]);

        int[][] matrix = new int[rows][column];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<int[]> indexes = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int current = matrix[row][col];
                if (current == number) {
                    int[] foundAt = {row, col};
                    indexes.add(foundAt);
                }
            }
        }

        if (indexes.isEmpty()) {
            System.out.println("not found");
        } else {
            String output = indexes.stream().map(arr -> arr[0] + " " + arr[1])
                            .collect(Collectors.joining(System.lineSeparator()));
            System.out.println(output);
        }
    }
}
