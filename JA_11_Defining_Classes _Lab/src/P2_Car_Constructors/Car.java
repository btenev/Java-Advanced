package P2_Car_Constructors;

public class Car {
    private String brand;
    private String model;
    private int horsePowers;

    public Car(String brand, String model, int horsePowers) {
        this.brand = brand;
        this.model = model;
        this.horsePowers = horsePowers;
    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePowers);
    }
}
