package P8_Custom_List_Sorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Box<T extends Comparable<T>> {
    private List<T> container;

    public Box(){
        this.container = new ArrayList<>();
    }

    public void add(T element) {
        this.container.add(element);
    }

    public T remove(int index) {
        return this.container.remove(index);
    }

    public boolean contains(T element) {
        return this.container.contains(element);
    }

    public void swap(int firstIndex, int secondIndex) {
        T temp = this.container.get(firstIndex);
        this.container.set(firstIndex, this.container.get(secondIndex));
        this.container.set(secondIndex, temp);
    }

    public int countGreaterThan(T element) {
        return(int)this.container
                .stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
    }

    public int size() {
        return this.container.size();
    }

    public T getIndex (int index) {
        return container.get(index);
    }

    public T getMax() {
        return Collections.max(this.container);
    }

    public T getMin() {
        return Collections.min(this.container);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        this.container.forEach(e -> sb.append(e).append(System.lineSeparator()));
        return sb.toString();
    }
}
