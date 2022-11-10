package P4_Raw_Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model,Engine engine, Cargo cargo) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = new ArrayList<>();
    }

    public List<Tire> getTires() {
        return tires;
    }

    public boolean validTires () {
        List<Tire> collect = this.tires.stream().filter(Tire::pressureIsLowerThanOne).collect(Collectors.toList());
        return collect.size() > 0;
    }

    public boolean validCars () {
        return engine.engineIsValid();
    }

    @Override
    public String toString() {
        return this.model;
    }
}
