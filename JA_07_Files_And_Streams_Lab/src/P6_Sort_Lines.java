import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;


public class P6_Sort_Lines {
    public static void main(String[] args) throws IOException {


        Path inputPath = Paths.get("C:\\Streams_And_Sets_Demo\\input.txt");
        Path outputPath = Paths.get("C:\\Streams_And_Sets_Demo\\06.SortLinesOutput.txt");

        List<String> lines = Files.readAllLines(inputPath).stream()
                .filter(l -> !l.isBlank())
                .sorted()
                .collect(Collectors.toList());

        Files.write(outputPath, lines);
    }
}
