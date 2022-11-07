import java.io.*;

public class P5_Write_Every_Third_Line {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Streams_And_Sets_Demo\\input.txt";
        String outputPath = "C:\\Streams_And_Sets_Demo\\05.WriteEveryThirdLineOutput.txt";

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(outputPath);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String read = bufferedReader.readLine();
        int counter = 1;
        while (read != null) {
            if (counter % 3 == 0) {
                bufferedWriter.write(read + System.lineSeparator());
            }
            read = bufferedReader.readLine();
            counter++;
        }
        bufferedWriter.flush();

    }
}
