import java.util.Arrays;
import java.util.Scanner;

public class P4_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(",\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);
        int[][] matrix = readMatrix(rows, columns, scanner);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        int sum = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                sum += matrix[row][col];
            }
        }
        System.out.println(sum);
    }

    private static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
