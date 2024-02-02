package lesson25;

import java.util.Comparator;

public class SuitcaseSizeComparator implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase o1, Suitcase o2) {
        return o1.getSize().compareTo(o2.getSize());
    }
}
