package P3_Generic_Swap_Method_String;

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

    public void swap(int indexOne, int indexTwo) {
        T temp = this.values.get(indexOne);
        this.values.set(indexOne,values.get(indexTwo) );
        this.values.set(indexTwo, temp);
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
