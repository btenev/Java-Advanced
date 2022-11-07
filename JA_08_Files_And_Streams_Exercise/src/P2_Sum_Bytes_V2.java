import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P2_Sum_Bytes_V2 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int read = bufferedReader.read();
        int sum = 0;
        while (read != -1) {
            if (read != 10 && read != 13) {
                sum += read;
            }
            read = bufferedReader.read();
        }
        System.out.println(sum);
    }
}
