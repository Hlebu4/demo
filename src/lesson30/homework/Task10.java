package lesson30.homework;

import java.util.*;

/*

10. Создать HashSet, добавить в него несколько строк и проверить, содержит ли он определенную строку.
    Создать TreeMap, где ключом является строка, а значением - ее длина. Вывести на экран все элементы TreeMap.
 */
public class Task10 {

    public void method (TreeMap <String , Integer> map , HashSet<String> set){
        for (String string : set){
            int stringLength = string.length();
            map.put(string , stringLength);
        }
    }
    public static void main(String[] args) {

        Task10 task10 = new Task10();
        HashSet<String> set = new HashSet<>();

        set.add("one");
        set.add("two");
        set.add("three");

        System.out.println(set.contains("two"));

        TreeMap <String,Integer> map = new TreeMap<>();
        task10.method(map , set);

        for (Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println( " Key - " + entry.getKey() + " Value - " + entry.getValue());
        }

    }
}
