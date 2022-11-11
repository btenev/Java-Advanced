package P8_Custom_List_Sorter;

public class Sorter {
    public static <T extends Comparable<T>> void sort(Box<T> box) {
        for (int e = 0; e < box.size(); e++) {
            T element = box.getIndex(e);
            for (int i = e + 1; i < box.size(); i++) {
                T elementTwo = box.getIndex(i);
                if (element.compareTo(elementTwo) > 0) {
                    box.swap(e, i);
                }
            }
        }
    }
}
