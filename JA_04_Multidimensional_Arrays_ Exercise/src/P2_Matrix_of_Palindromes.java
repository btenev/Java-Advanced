import java.util.Scanner;

public class P2_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);
        String[][] matrix = new String[rows][columns];

        populateMatrix(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void populateMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            char firstLetterLastLetter = (char) (97 + row);
            for (int col = 0; col < matrix[row].length; col++) {
                char middleLetter = (char) (firstLetterLastLetter + col);
                matrix[row][col] = firstLetterLastLetter + "" + middleLetter + firstLetterLastLetter;
            }
        }
    }
}
