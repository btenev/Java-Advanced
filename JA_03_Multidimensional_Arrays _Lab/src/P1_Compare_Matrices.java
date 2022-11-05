import java.util.Arrays;
import java.util.Scanner;

public class P1_Compare_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsFirstMatrix = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int[][] firstMatrix = readMatrix(rowsFirstMatrix, scanner);
        int rowsSecondMatrix = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int[][] secondMatrix = readMatrix(rowsSecondMatrix, scanner);

        boolean areEqual = areEqual(firstMatrix, secondMatrix);
        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);
    }

    private static boolean areEqual(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int [] firstMatrixArray = firstMatrix[row];
            int [] secondMatrixArray = secondMatrix[row];

            if (firstMatrixArray.length != secondMatrixArray.length) {
                return false;
            }

            for (int index = 0; index < firstMatrixArray.length; index++) {
                if (firstMatrixArray[index] != secondMatrixArray[index]) {
                    return false;
                }

            }
        }
        return true;
    }

    private static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        return matrix;
    }
}
