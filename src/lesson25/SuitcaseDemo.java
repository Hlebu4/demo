package lesson25;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SuitcaseDemo {
    public static void main(String[] args) {


        Comparator<Suitcase> suitcaseComparator = new SuitcaseSizeComparator().
                thenComparing(new SuitcaseMaterialComparator().
                        thenComparing(new SuitcaseColorComparator()));

        TreeSet<Suitcase> ourSuitcase = new TreeSet<>(suitcaseComparator);

        ourSuitcase.add(new Suitcase("leather" , "M" , "Black "));
        ourSuitcase.add(new Suitcase("Plastic" , "S" , "Red "));
        ourSuitcase.add(new Suitcase("leather" , "XL" , "Whit"));
        ourSuitcase.add(new Suitcase("Plastic" , "L" , "Whit"));
        ourSuitcase.add(new Suitcase("Plastic" , "M" , "Black "));
        ourSuitcase.add(new Suitcase("leather" , "L" , "Black "));
        ourSuitcase.add(new Suitcase("leather" , "M" , "Whit "));

        System.out.println(ourSuitcase);

        List<Suitcase> listSuitcase = new LinkedList<>();

        listSuitcase.add(new Suitcase("leather" , "M" , "Black "));
        listSuitcase.add(new Suitcase("Plastic" , "S" , "Red "));
        listSuitcase.add(new Suitcase("leather" , "XL" , "Whit"));
        listSuitcase.add(new Suitcase("Plastic" , "L" , "Whit"));
        listSuitcase.add(new Suitcase("Plastic" , "M" , "Black "));
        listSuitcase.add(new Suitcase("leather" , "L" , "Black "));
        listSuitcase.add(new Suitcase("leather" , "M" , "Whit "));

        System.out.println(listSuitcase);

        listSuitcase.sort(suitcaseComparator);

        System.out.println(" \n after comparator - \n" + listSuitcase);

        ;
    }

}
