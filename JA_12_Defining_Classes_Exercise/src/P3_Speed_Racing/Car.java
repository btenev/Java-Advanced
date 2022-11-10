package P3_Speed_Racing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelConsumption;
    private double distanceTravelled;

    public Car(String model, double fuelAmount, double fuelConsumption) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
        this.distanceTravelled = 0;
    }

   public boolean driveDistance (double kmToDrive) {
        double fuelNeeded = kmToDrive * this.fuelConsumption;
        if (fuelNeeded <= this.fuelAmount) {
            this.fuelAmount -= fuelNeeded;
            this.distanceTravelled += kmToDrive;
            return true;
        }
        return false;
   }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distanceTravelled);
    }
}
