package P1_Car_Info;

public class Car {
    private String brand;
    private String model;
    private int horsePowers;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    public String carInfo () {
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.horsePowers);
    }
}
