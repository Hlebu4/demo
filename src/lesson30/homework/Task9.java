package lesson30.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
9. Создать HashMap, где ключом является любых десять чисел типа Integer, а значением - его квадрат.
Вывести на экран все элементы HashMap.

 */
public class Task9 {

    public HashMap < Integer , Integer> madeCollection (HashMap<Integer, Integer> collection){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(100);
            collection.put(number, number*number);
        }
        return collection;
    }
    
    
    public static void main(String[] args) {

        Task9 task9 = new Task9();
        HashMap <Integer , Integer> collection = new HashMap<>();

        collection = task9.madeCollection(collection);

        for (Map.Entry<Integer,Integer> entry : collection.entrySet()){
            System.out.println( "Key - " + entry.getKey() + " Value - " + entry.getValue());
        }

    }

}
