package lesson30.homework;

import java.util.HashMap;
import java.util.Map;

/*

8. Напишите метод, который получает на вход Map и возвращает Map, где ключи и значения поменяны местами.
Так как значения могут совпадать, то тип значения в Map будет уже не K, а Collection: Map>

 */
public class Task8 {

        public HashMap<HashMap <Integer , Integer> , String> changeCollection (HashMap < String, Integer > collection){
            HashMap<HashMap<Integer , Integer>, String> myNewCollection = new HashMap<>();
            int counter = 0;
            for (Map.Entry<String, Integer> countCollection : collection.entrySet()) {
                String keyString = countCollection.getKey();
                Integer valueInteger = countCollection.getValue();
                HashMap<Integer , Integer> valueCollection = new HashMap<>();
                valueCollection.put(counter , valueInteger);
                myNewCollection.put(valueCollection , keyString);
                counter++;
            }
            return myNewCollection;
        }

    public static void main(String[] args) {

            Task8 task8= new Task8();
            HashMap <String , Integer> collection = new HashMap<>();
            collection.put("one" , 1);
            collection.put("two" , 2);
            collection.put("three" , 3);
            collection.put("again one" , 1);
        System.out.println(collection);

            HashMap <HashMap<Integer , Integer> , String> newCollection = task8.changeCollection(collection);
        System.out.println("\n" + newCollection);
    }
}
