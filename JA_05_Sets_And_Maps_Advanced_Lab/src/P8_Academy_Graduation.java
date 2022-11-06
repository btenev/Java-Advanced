import java.util.*;

public class P8_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> marks = new TreeMap<>();
        while (n-- > 0) {
            String studentName = scanner.nextLine();
            double[] inputMarks = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            marks.put(studentName, inputMarks);
        }
        marks.entrySet().stream().forEach(student -> {
            double sum = 0;
            for (double singleMark : student.getValue()) {
                sum += singleMark;
            }
            System.out.println(student.getKey() + " is graduated with " + sum/student.getValue().length);
        });
    }
}
