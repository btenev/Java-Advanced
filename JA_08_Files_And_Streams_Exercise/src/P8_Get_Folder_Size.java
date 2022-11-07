import java.io.File;

public class P8_Get_Folder_Size {
    public static void main(String[] args) {

        File root = new File("C:\\Files_And_Streams\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        long sum = 0;
        if (root.exists()) {
            File[] files = root.listFiles();
            for (File file : files) {
                long length = file.length();
                sum += length;
            }
        }
        System.out.println(sum);
    }
}
