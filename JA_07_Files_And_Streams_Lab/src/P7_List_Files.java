import java.io.File;

public class P7_List_Files {
    public static void main(String[] args) {

        File file = new File("C:\\Streams_And_Sets_Demo\\Files-and-Streams");

        if(file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if(!f.isDirectory()) {
                        System.out.printf("%s: [%s]%n", f.getName(), f.length());
                    }
                }
            }
        }
    }
}
