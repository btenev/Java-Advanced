import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P4_Add_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        UnaryOperator<Double> calcVat = x -> x * 1.20;
        System.out.println("Prices with VAT:");
        Arrays.stream(input)
                .map(Double::parseDouble)
                .map(calcVat)
                .forEach(e -> System.out.printf("%.2f%n",e));
    }
}
