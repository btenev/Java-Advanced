import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class P7_Merge_Two_Files {
    public static void main(String[] args) throws IOException {
        Path pathOne =
                Paths.get("C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path pathTwo =
                Paths.get("C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
    String result = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result2.txt";

        List<String> fistFile = Files.readAllLines(pathOne);
        List<String> secondFile = Files.readAllLines(pathTwo);
        PrintWriter printWriter = new PrintWriter(result);

        fistFile.forEach(printWriter::println);
        secondFile.forEach(printWriter::println);
        printWriter.flush();
    }
}
