import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Supplier<Integer> getRandomInt = () -> new Random().nextInt();

        int a = getRandomInt.get();
        int b = 5;
        int result = a + b;
        System.out.println(result);
    }
}
