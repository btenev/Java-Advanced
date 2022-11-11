package P5_Generic_Count_Method_String;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>{
    List<T> content;

    public Box() {
        this.content = new ArrayList<>();
    }

    public void add(T element) {
        this.content.add(element);
    }

    public int returnCountOfGreaterElements(T element) {
        int count = 0;
        for (T current : this.content) {
            int result = current.compareTo(element);
            if (result > 0) {
                count++;
            }
        }
        return count;
    }
}
