import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class P3_ALL_CAPITALS_V2 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output1.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(output));
        Files.readAllLines(Path.of(path)).forEach(line -> {
            try {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bufferedWriter.flush();
    }
}
