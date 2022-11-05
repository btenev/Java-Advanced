import java.util.Scanner;

public class P3_Intersection_of_Two_Matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //3
        //4
        //a b c d
        //a b c d
        //a b c d
        //k b c k
        //a b g d
        //a k c d

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, columns, scanner);
        char[][] secondMatrix = readMatrix(rows, columns, scanner);
        char[][] outputMatrix = new char[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                char fillChar = firstMatrix[row][col] == secondMatrix[row][col] ? firstMatrix[row][col] : '*';
                outputMatrix[row][col] = fillChar;

            }
        }
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < columns; col++) {
//                System.out.print(outputMatrix[row][col] + " ");
//            }
//            System.out.println();
//        }
        for (char[] array : outputMatrix) {
            for (char element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static char[][] readMatrix(int rows, int columns, Scanner scanner) {
        char[][] matrix = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int i = 0; i < line.length; i++) {
                char current = line[i].charAt(0);
                matrix[row][i] = current;
                //String line = scanner.nextLine();
                //char[] char = line.replace(" ", "").toCharArray();
                // matrix[row] = char;
            }
        }
        return matrix;
    }
}
