import java.util.Arrays;
import java.util.Scanner;

public class P5_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //3, 6
        //7, 1, 3, 3, 2, 1
        //1, 3, 9, 8, 5, 6
        //4, 6, 7, 9, 1, 0

        int rows = Integer.parseInt(scanner.nextLine().split(",\\s+")[0]);
        int[][] matrix = readMatrix(rows, scanner, ", ");
        int maxSum = 0;
        int[][] maxMatrix = new int[2][2];
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int current = matrix[row][col];
                int rightNum = matrix[row][col + 1];
                int bottom = matrix[row + 1][col];
                int bottomRight = matrix[row + 1][col + 1];
                int sum = current + rightNum + bottom + bottomRight;
                if (sum > maxSum) {
                    maxSum = sum;
                    maxMatrix = new int[][] {
                            {current, rightNum},
                            {bottom, bottomRight}
                    };
                }
            }

        }
        for (int[] ints : maxMatrix) {
            for (int numbers : ints) {
                System.out.print(numbers + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
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
