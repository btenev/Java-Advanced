import java.util.Arrays;
import java.util.Scanner;

public class P4_Maximal_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);
        int [][] maxMatrix = new int[3][3];
        int[][] matrix = readMatrix(rows, columns, scanner);
        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int currentDigit = matrix[row][col];
                int firstRight = matrix[row][col + 1];
                int secondRight = matrix[row][col + 2];
                int bottom = matrix[row + 1][col];
                int bottomFirst = matrix[row + 1][col + 1];
                int bottomSecond = matrix[row + 1][col + 2];
                int nextBottom = matrix[row + 2][col];
                int nextBottomFirst = matrix[row + 2][col + 1];
                int nextBottomSecond = matrix[row + 2][col + 2];

                int sum = currentDigit + firstRight + secondRight + bottom + bottomFirst + bottomSecond
                        + nextBottom + nextBottomFirst + nextBottomSecond;

                if (sum > maxSum) {
                    maxSum = sum;

                    maxMatrix = new int[][] {
                            {currentDigit, firstRight, secondRight},
                            {bottom, bottomFirst, bottomSecond},
                            {nextBottom, nextBottomFirst, nextBottomSecond}
                    };
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        printMaxMatrix(maxMatrix);
    }

    private static void printMaxMatrix(int[][] maxMatrix) {
        for (int[] matrix : maxMatrix) {
            for (int digit : matrix) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }
    }

    private static int[][] readMatrix(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < columns; col++) {
                int currentDigit = line[col];
                matrix[row][col] = currentDigit;
            }
        }
        return matrix;
    }
}
