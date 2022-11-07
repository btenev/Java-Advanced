import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P1_Sum_Lines_V2 {
    public static void main(String[] args) throws IOException {

        Path path =
                Path.of("C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> allLines = Files.readAllLines(path);

        allLines
                .stream()
                .map(String::toCharArray)
                .forEach(charArray -> {
                    int sum = 0;
                    for (char c : charArray) {
                        sum += c;
                    }
                    System.out.println(sum);
                });
    }
}
