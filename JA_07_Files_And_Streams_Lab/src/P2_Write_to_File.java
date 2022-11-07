import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class P2_Write_to_File {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Streams_And_Sets_Demo\\input.txt";
        String pathOutPut = "C:\\Streams_And_Sets_Demo\\02.WriteToFileOutput.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(pathOutPut);

        int value = fileInputStream.read();
        Set<Character> punctuations = Set.of(',', '.', '!', '?');
        while (value != -1) {
            char current = (char) value;
            if (!punctuations.contains(current)) {
                fileOutputStream.write(current);
            }
            value = fileInputStream.read();
        }
        fileOutputStream.close();
    }
}
