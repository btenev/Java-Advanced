import java.io.*;


public class P3_Copy_Bytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Streams_And_Sets_Demo\\input.txt";
        String outputPath = "C:\\Streams_And_Sets_Demo\\03.CopyBytesOutput.txt";

        FileInputStream fileInputStream = new FileInputStream(path);
        FileOutputStream fileOutputStream = new FileOutputStream(outputPath);
        PrintStream printStream = new PrintStream(fileOutputStream);

        int value = fileInputStream.read();

        while (value != -1) {
            if (value != 10 && value != 32) {
                printStream.print(value);
            } else {
                printStream.print((char)value);
            }

            value = fileInputStream.read();
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
