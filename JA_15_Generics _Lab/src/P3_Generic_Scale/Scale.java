package P3_Generic_Scale;

public class Scale <T extends Comparable<T>>{
    private final T left;
    private final T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        int compared = this.left.compareTo(this.right);
        if (compared > 0) {
            return left;
        } else if (compared < 0) {
            return right;
        }
        return null;
    }
}
