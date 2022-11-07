import java.io.FileInputStream;
import java.io.IOException;

public class P1_Read_File {
    public static void main(String[] args) {

        String path = "C:\\Streams_And_Sets_Demo\\input.txt";

        try(FileInputStream fileStream = new FileInputStream(path)) {
            int value = fileStream.read();
            while (value != -1) {
                System.out.print(Integer.toBinaryString(value) + " ");
                value = fileStream.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
