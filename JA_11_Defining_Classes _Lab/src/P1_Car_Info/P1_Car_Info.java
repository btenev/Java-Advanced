package P1_Car_Info;

import java.util.ArrayList;
import java.util.Scanner;

class P1_Car_Info {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> listOfCars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String brand = tokens[0];
            String model = tokens[1];
            int horsePowers = Integer.parseInt(tokens[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePowers(horsePowers);
            listOfCars.add(car);
        }
        for (Car car : listOfCars) {
            System.out.println(car.carInfo());
        }
    }
}
