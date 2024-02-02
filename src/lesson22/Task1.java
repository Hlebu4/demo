package lesson22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {


        ArrayList<String> alphabetArrayList = new ArrayList<>(10);


        for (char letter = 'A' ; letter <= 'J' ; letter ++){
            alphabetArrayList.add(String.valueOf(letter));
        }

        System.out.println(alphabetArrayList);


        Collections.reverse(alphabetArrayList);
        System.out.println(alphabetArrayList);

    }
}