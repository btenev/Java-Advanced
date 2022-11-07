import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class P5_Line_Numbers {
    public static void main(String[] args) throws FileNotFoundException {

        String path =
                "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String output = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output4.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(fileInputStream);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        PrintWriter printWriter = new PrintWriter(output);

        while (scanner.hasNextLine()) {
            String currentLine =  scanner.nextLine();
            printWriter.println(atomicInteger.incrementAndGet() + ". " + currentLine);
        }
        printWriter.flush();
    }
}
