package P4_Raw_Data;

public class Engine {
    private int engineSpeed;
    private int enginePower;

    public Engine (int engineSpeed, int enginePower) {
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public boolean engineIsValid () {
        return this.enginePower > 250;
    }
 }
