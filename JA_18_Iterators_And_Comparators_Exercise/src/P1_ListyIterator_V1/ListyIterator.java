package P1_ListyIterator_V1;

import java.util.Arrays;
import java.util.List;


public class ListyIterator {
    private List<String> collection;
    private int index;

    public ListyIterator(String... items) {
        this.collection = Arrays.asList(items);
    }

    public boolean move() {
        if (!hasNext()) {
            return false;
        }
        index++;
        return true;
    }

    public boolean hasNext() {
        return this.index < collection.size() - 1;
    }

    public void print() {
        if (this.collection.isEmpty()) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        System.out.println(this.collection.get(this.index));
    }
}
