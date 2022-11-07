import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P6_Word_Count {
    public static void main(String[] args) throws IOException {
        String wordsPath = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String text = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        String output = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt";
        FileInputStream fileInputStream = new FileInputStream(wordsPath);
        FileInputStream fileInputStreamText = new FileInputStream(text);
        Scanner scanner = new Scanner(fileInputStream);

        String[] wordsToCount = scanner.nextLine().split(" ");
        Map<String, Integer> numOfWords = new HashMap<>();
        Arrays.stream(wordsToCount).forEach(w -> numOfWords.put(w, 0));

        Scanner scanner1 = new Scanner(fileInputStreamText);
        while (scanner1.hasNext()){
            String current = scanner1.next();
            if (numOfWords.containsKey(current)) {
                numOfWords.put(current, numOfWords.get(current) + 1);
            }
        }
        PrintWriter printWriter = new PrintWriter(output);
        numOfWords
                .entrySet()
                .stream()
                .sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry ->
                        printWriter.write(entry.getKey() + " - " + entry.getValue() + System.lineSeparator()));


        printWriter.flush();
    }
}
