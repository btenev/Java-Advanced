import java.util.Arrays;
import java.util.Scanner;

public class P3_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        populateMatrix(matrix, scanner, " ");
        printDiagonalDifference(matrix, n);
    }

    private static void printDiagonalDifference(int[][] matrix, int n) {
        int sumPrimaryDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        for (int size = 0; size < matrix.length; size++) {
            int currentNumPrimary = matrix [size][size];
            sumPrimaryDiagonal += currentNumPrimary;

            int currentNumSec = matrix [size] [n - 1 - size];
            sumSecondaryDiagonal += currentNumSec;
        }
        int result = Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
        System.out.println(result);
    }

    private static void populateMatrix(int[][] matrix, Scanner scanner, String splitPattern) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern))
                        .mapToInt(Integer::parseInt).toArray();
        }
    }
}
