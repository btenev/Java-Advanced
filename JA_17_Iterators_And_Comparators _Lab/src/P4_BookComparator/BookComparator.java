package P4_BookComparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book first, Book second) {
        int compared = first.getTitle().compareTo(second.getTitle());

        if (compared == 0) {
            compared = Integer.compare(first.getYear(), second.getYear());
        }
        return compared;
    }
}
