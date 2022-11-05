import java.util.Arrays;
import java.util.Scanner;

public class P6_Print_Diagonals_of_Square_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(n, scanner, "\\s+");
        int row = 0;
        int column = 0;

        while (row < n && column < n) {
            int element = matrix[row][column];
            System.out.print(element + " ");
            row++;
            column++;
        }
        System.out.println();
        row = n - 1;
        column = 0;
        while (row >= 0 && column < n) {
            int element = matrix[row][column];
            System.out.print(element + " ");
            row--;
            column++;
        }
    }

    private static int[][] readMatrix(int rows, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern))
                            .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
