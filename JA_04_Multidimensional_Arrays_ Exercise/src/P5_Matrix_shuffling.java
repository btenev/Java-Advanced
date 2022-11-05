import java.util.Scanner;

public class P5_Matrix_shuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(tokens[0]);
        int colons = Integer.parseInt(tokens[1]);

        String[][] matrix = new String[rows][colons];
        fillMatrix(matrix, scanner);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] param = input.split(" ");
            String command = param[0];
            boolean validParam = false;
            if (command.equals("swap")) {
                if (param.length == 5) {
                    int row = Integer.parseInt(param[1]);
                    int column = Integer.parseInt(param[2]);
                    int newRow = Integer.parseInt(param[3]);
                    int newCol = Integer.parseInt(param[4]);
                    boolean validCoordinates = areValidCoordinates(matrix, row, column, newRow, newCol);
                    if (validCoordinates) {
                        validParam = true;
                        String currentSymbol = matrix[row][column];
                        String newSymbol = matrix[newRow][newCol];
                        matrix[row][column] = newSymbol;
                        matrix[newRow][newCol] = currentSymbol;
                    }
                }
            }
            if (!validParam) {
                System.out.println("Invalid input!");
            } else {
                printMatrix(matrix);
            }
            input = scanner.nextLine();
        }
    }

    private static void printMatrix(String [][] matrix) {
        for (String[] line : matrix) {
            for (String symbol : line) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    private static boolean areValidCoordinates(String[][] matrix, int row, int column, int newRow, int newCol) {
        return row < matrix.length && row >= 0 && column < matrix[row].length && column >= 0
                && newRow < matrix.length && newRow >= 0 && newCol < matrix[row].length && newCol >= 0;
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split(" ");

        }
    }
}
