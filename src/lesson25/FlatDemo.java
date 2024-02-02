package lesson25;

import java.util.TreeSet;
import java.util.concurrent.ThreadPoolExecutor;

public class FlatDemo {
    public static void main(String[] args) {

        TreeSet<Flat> ourFlat = new TreeSet<>();

        ourFlat.add(new Flat(82,3));
        ourFlat.add(new Flat(75,2));
        ourFlat.add(new Flat(28,3));

        System.out.println(ourFlat);

    }
}
