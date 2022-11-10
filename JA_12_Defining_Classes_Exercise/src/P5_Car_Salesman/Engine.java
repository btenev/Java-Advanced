package P5_Car_Salesman;

public class Engine {
    String model;
    int power;
    //optional
    int displacement;
    String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = 0;
        this.efficiency = "n/a";
    }

    public Engine(String model, int power, int displacement) {
        this(model,power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacement, String efficiency) {
        this(model, power, displacement);
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        String displacement;
        if (this.displacement == 0) {
            displacement = "n/a";
        } else {
            displacement = this.displacement + "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(model + ":").append("\n")
                .append("Power: " + power).append("\n")
                .append("Displacement: " + displacement).append("\n")
                .append("Efficiency: " + efficiency).append("\n");
        return sb.toString();
    }
}
