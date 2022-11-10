package P4_Raw_Data;

public class Tire {
    double tirePressure;
    int tireAge;

    public Tire (double tirePressure,int tireAge) {
        this.tirePressure = tirePressure;
        this.tireAge = tireAge;
    }
    public boolean pressureIsLowerThanOne() {
        return tirePressure < 1;
    }
}
