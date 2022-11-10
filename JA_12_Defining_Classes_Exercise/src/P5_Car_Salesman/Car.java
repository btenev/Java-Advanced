package P5_Car_Salesman;

public class Car {
    String model;
    Engine engine;
    //optional
    int weight;
    String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, String color, int weight){
        this(model, engine, color);
        this.weight = weight;
    }

    @Override
    public String toString() {
        String weight;
        if (this.weight == 0) {
            weight = "n/a";
        } else {
            weight = this.weight + "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.model).append(":").append("\n")
                .append(engine.toString()).append("Weight: " + weight).append("\n")
                .append("Color: " + color);
        return sb.toString();
    }
}
