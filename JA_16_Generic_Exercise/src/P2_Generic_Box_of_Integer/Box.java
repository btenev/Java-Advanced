package P2_Generic_Box_of_Integer;

import java.util.ArrayList;
import java.util.List;

public class Box<T>{
    List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(T element : values) {
            sb.append(String.format("%s: %s",element.getClass().getName()
                    , element.toString())).append(System.lineSeparator());

        }
        return sb.toString();
    }
}
