package P5_Car_Salesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfEngines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < numOfEngines; i++) {
            String[] tokensOfEngine = scanner.nextLine().split("\\s+");
            String engineModel = tokensOfEngine[0];
            int enginePower = Integer.parseInt(tokensOfEngine[1]);
            Engine engine = null;
            switch (tokensOfEngine.length) {
                case 2:
                    engine = new Engine(engineModel, enginePower);
                    break;
                case 4:
                    int displacement = Integer.parseInt(tokensOfEngine[2]);
                    String efficiency = tokensOfEngine[3];
                    engine = new Engine(engineModel, enginePower, displacement, efficiency);
                    break;
                case 3:
                    try{
                        int displacement1 = Integer.parseInt(tokensOfEngine[2]);
                        engine = new Engine(engineModel, enginePower, displacement1);
                    } catch (NumberFormatException exception) {
                        String efficiency1 = tokensOfEngine[2];
                        engine = new Engine(engineModel, enginePower,efficiency1);
                    }
                    break;
            }
            engines.put(engineModel,engine);
        }

        int numOfCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfCars; i++) {
            // "{Model} {Engine} {Weight} {Color}",
            String[] tokensOfCar = scanner.nextLine().split("\\s+");
            String carModel = tokensOfCar[0];
            String carEngine = tokensOfCar[1];
            Engine engine = engines.get(carEngine);
            Car car = null;
            switch (tokensOfCar.length) {
                case 2:
                    car = new Car(carModel, engine);
                    break;
                case 4:
                    int weight = Integer.parseInt(tokensOfCar[2]);
                    String color = tokensOfCar[3];
                    car = new Car(carModel, engine, color, weight);
                    break;
                case 3:
                    try {
                        int weight1 = Integer.parseInt(tokensOfCar[2]);
                        car = new Car(carModel, engine, weight1);
                    } catch (NumberFormatException e) {
                        String color1 = tokensOfCar[2];
                        car = new Car(carModel, engine, color1);
                    }
                    break;
            }
            cars.add(car);
        }
        cars.forEach(System.out::println);
    }
}
