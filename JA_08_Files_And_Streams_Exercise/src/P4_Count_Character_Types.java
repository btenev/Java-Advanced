import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

public class P4_Count_Character_Types {
    public static void main(String[] args) throws IOException {
        String input = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String output = "C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output3.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(input));

        int read = bufferedReader.read();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> symbols = Set.of('!', ',', '.', '?');
        int vowelCounter = 0;
        int consonantCounter = 0;
        int punctuationCounter = 0;
        while (read != -1) {
            char current = (char) read;
            if (current == ' ' || read == 10 || read == 13) {
                read = bufferedReader.read();
                continue;
            } else if (vowels.contains(current)) {
                vowelCounter++;
            } else if (symbols.contains(current)) {
                punctuationCounter++;
            } else {
                consonantCounter++;
            }
            read = bufferedReader.read();
        }
        PrintWriter printWriter = new PrintWriter(output);
        printWriter.write("Vowels: " + vowelCounter + "\n");
        printWriter.write("Consonants: " + consonantCounter + "\n");
        printWriter.write("Punctuation: " + punctuationCounter + "\n");
        printWriter.flush();
    }
}
