package P4_Raw_Data;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfCars = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < numOfCars; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String carModel = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            double tirePressure1 = Double.parseDouble(tokens[5]);
            int tireAge1 = Integer.parseInt(tokens[6]);
            double tirePressure2 = Double.parseDouble(tokens[7]);
            int tireAge2 = Integer.parseInt(tokens[8]);
            double tirePressure3 = Double.parseDouble(tokens[9]);
            int tireAge3 = Integer.parseInt(tokens[10]);
            double tirePressure4 = Double.parseDouble(tokens[11]);
            int tireAge4 = Integer.parseInt(tokens[12]);

            Car car = new Car(carModel, new Engine(engineSpeed,enginePower), new Cargo(cargoWeight, cargoType));
            car.getTires().add(new Tire(tirePressure1,tireAge1));
            car.getTires().add(new Tire(tirePressure2,tireAge2));
            car.getTires().add(new Tire(tirePressure3,tireAge3));
            car.getTires().add(new Tire(tirePressure4,tireAge4));
            cars.add(car);
        }
        String command = scanner.nextLine();
        switch (command) {
            case "fragile":
                cars.stream().filter(Car::validTires).forEach(System.out::println);
                    break;
            case "flamable":
                cars.stream().filter(Car::validCars).forEach(System.out::println);
                break;
        }
    }
}
