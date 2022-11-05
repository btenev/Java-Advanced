import java.util.Arrays;
import java.util.Scanner;

public class P8_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(rows, scanner, "\\s+");
        int[] coordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int wrongRow = coordinates[0];
        int wrongColumn = coordinates[1];
        int wrongNumber = matrix[wrongRow][wrongColumn];
        int[][] outputMatrix = new int[rows][];

        for (int row = 0; row < rows; row++) {
            int [] currentLine = new int[matrix[row].length];
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];
                int leftNum = 0;
                int rightNum = 0;
                int topNum = 0;
                int bottomNum = 0;

                if (currentNumber == wrongNumber) {
                    boolean validateLeft = isValidIndex(matrix, row , col - 1);
                    leftNum = returnNum(wrongNumber, validateLeft, matrix, row , col - 1);
                    boolean validateRight = isValidIndex(matrix, row, col +1);
                    rightNum = returnNum(wrongNumber, validateRight, matrix, row, col + 1);
                    boolean validateTop = isValidIndex(matrix, row - 1, col);
                    topNum = returnNum(wrongNumber, validateTop, matrix, row - 1, col);
                    boolean validateBottom = isValidIndex(matrix, row +1, col);
                    bottomNum = returnNum(wrongNumber, validateBottom, matrix, row + 1, col);
                } else {
                    currentLine[col] = currentNumber;
                }
                int result = leftNum + rightNum + topNum + bottomNum;
                if (result != 0) {
                    currentLine[col] = result;
                }
                outputMatrix[row] = currentLine;
            }
        }
        for (int[] ints : outputMatrix) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static int returnNum(int wrongNum, boolean validNum, int[][] matrix, int row, int col) {
        int number = 0;
        if (validNum) {
            int currentWrong  = matrix[row][col];
            if (currentWrong != wrongNum) {
                number = currentWrong;
            }
        }
        return number;
    }

    private static boolean isValidIndex(int[][] matrix, int row, int col) {
        return row < matrix.length && row >= 0 && col < matrix[row].length && col >= 0;
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
