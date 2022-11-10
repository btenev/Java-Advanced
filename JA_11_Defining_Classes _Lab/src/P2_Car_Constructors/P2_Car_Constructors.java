package P2_Car_Constructors;

import java.util.ArrayList;
import java.util.Scanner;

public class P2_Car_Constructors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> listOfCars = new ArrayList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car;

            if (tokens.length == 1) {
                car = new Car(tokens[0]);
            } else {
                car = new Car(tokens[0], tokens[1],Integer.parseInt(tokens[2]));
            }
            listOfCars.add(car);
        }
        for (Car car : listOfCars) {
            System.out.println(car);
        }
    }
}
