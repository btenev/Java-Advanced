package P3_Speed_Racing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String,Car> carCollection = new LinkedHashMap<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split(" ");
            String model = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelConsumption = Double.parseDouble(tokens[2]);
            Car car = new Car(model, fuelAmount, fuelConsumption);
            carCollection.put(model, car);
        }

        String[] driveCommand = scanner.nextLine().split(" ");
        while (!driveCommand[0].equals("End")) {
            String model = driveCommand[1];
            double kmToDrive = Double.parseDouble(driveCommand[2]);
            Car car = carCollection.get(model);
            if (!car.driveDistance(kmToDrive)) {
                System.out.println("Insufficient fuel for the drive");
            }
            driveCommand = scanner.nextLine().split(" ");
        }
        carCollection
                .values()
                .forEach(System.out::println);
    }
}
