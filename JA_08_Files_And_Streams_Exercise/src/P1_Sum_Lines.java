import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P1_Sum_Lines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String readLine = bufferedReader.readLine();

        while (readLine != null) {
            int sum = 0;
            for (int i = 0; i < readLine.length(); i++) {
                char current = readLine.charAt(i);
                sum += current;
            }
            System.out.println(sum);
            readLine = bufferedReader.readLine();
        }
    }
}
