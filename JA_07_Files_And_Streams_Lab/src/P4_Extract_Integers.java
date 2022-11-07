import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class P4_Extract_Integers {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Streams_And_Sets_Demo\\input.txt";
        String outputPath = "C:\\Streams_And_Sets_Demo\\04.ExtractIntegersOutput.txt";

        Scanner scanner = new Scanner(new FileInputStream(path));
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(outputPath));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                printWriter.println(scanner.nextInt());
            }
            scanner.next();
        }
        printWriter.close();
    }
}
