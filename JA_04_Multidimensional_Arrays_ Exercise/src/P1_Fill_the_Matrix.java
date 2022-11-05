import java.util.Scanner;

public class P1_Fill_the_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[size][size];

        switch (pattern) {
            case "A":
                fillByPatternA(matrix);
                break;
            case "B":
                fillByPatternB(matrix);
                break;
        }
        printMatrix(matrix);
    }

//    private static void fillByPatternB(int[][] matrix) {
//        int counter = 1;
//        int col = 0;
//        while (col < matrix.length) {
//            for (int row = 0; row < matrix.length; row++) {
//                matrix[row][col] = counter++;
//            }
//            col++;
//            if (col == matrix.length) {
//                break;
//            }
//            for (int row = matrix.length - 1; row >= 0 ; row--) {
//                matrix[row][col] = counter++;
//            }
//            col++;
 //       }
//    }
    private static void fillByPatternB(int[][] matrix) {
       int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = counter++;
                }
            }
          
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void fillByPatternA(int[][] matrix) {
        int counter = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }
}

