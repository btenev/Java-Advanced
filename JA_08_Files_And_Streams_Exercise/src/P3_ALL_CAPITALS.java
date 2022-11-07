import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class P3_ALL_CAPITALS {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        PrintWriter printWriter = new PrintWriter(output);

        String readLine = bufferedReader.readLine();

        while (readLine != null) {
            String write = readLine.toUpperCase();
            printWriter.println(write);
            readLine = bufferedReader.readLine();
        }
        printWriter.close();
    }
}
