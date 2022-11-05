import java.util.Arrays;
import java.util.Scanner;

public class P2_Positions_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int[][] matrix = readMatrix(rows, scanner);
        int searchNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = isFound(matrix, searchNumber);

        if (!isFound) {
            System.out.println("not found");
        }
    }

    private static boolean isFound(int[][] matrix, int number) {
        boolean found = false;
        for (int row = 0; row < matrix.length; row++) {
            int[] array = matrix[row];

            for (int index = 0; index < array.length; index++) {
                if (array[index] == number) {
                    System.out.println(row + " " + index);
                    found = true;
                }
            }
        }
        return found;
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
