package lesson25;

import java.util.Comparator;

public class SuitcaseColorComparator implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase o1, Suitcase o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
