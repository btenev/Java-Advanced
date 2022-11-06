import java.util.*;

public class P5_Average_Students_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> gradeDatabase = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double grade = Double.parseDouble(tokens[1]);
            gradeDatabase.putIfAbsent(name, new ArrayList<>());
            gradeDatabase.get(name).add(grade);
        }

        gradeDatabase.entrySet().forEach(entry -> {System.out.print(entry.getKey() + " -> ");
            List<Double> value = entry.getValue();
//          double sum = value.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                double sum = 0;
            for (Double num : value) {
                sum += num;
            }
            value.forEach(e -> System.out.printf("%.2f ", e));
            System.out.printf("(avg: %.2f)%n", sum / value.size());
        });
    }
}
