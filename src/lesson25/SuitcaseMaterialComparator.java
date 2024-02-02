package lesson25;

import java.util.Comparator;

public class SuitcaseMaterialComparator implements Comparator<Suitcase> {

    @Override
    public int compare(Suitcase o1, Suitcase o2) {
        return o1.getMaterial().compareTo(o2.getMaterial());
    }
}
