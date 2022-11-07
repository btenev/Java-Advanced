import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P2_Sum_Bytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        byte[] bytes = Files.readAllBytes(Path.of(path));
        int sum = 0;

        for (byte aByte : bytes) {
            if (aByte != 10 && aByte != 13) {
                sum += aByte;
            }
        }
        System.out.println(sum);
    }
}