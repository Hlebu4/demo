package lesson30.homework;

import java.util.HashSet;
import java.util.SortedMap;

/*
2. Найти количество уникальных слов в тексте с помощью коллекции HashSet. Создать множество HashSet
   и вывести элементы, у которых длина строки больше 5 символов:
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "Hi my , my  name, _=is is Andrey ";

        HashSet<String> myText = new HashSet<>();
        String [] arrayText = text.replaceAll("[^a-zA-Z ]" , "").split("\\s+");
        for (String word : arrayText){
            myText.add(word);
        }
        int counter=0;
        for (String word : myText){
            counter++;
        }
        System.out.println(counter);

        HashSet<String> myText2 = new HashSet<>();
        for (String word : arrayText){
            if (word.length() > 5){
                myText2.add(word);
            }
        }
        System.out.println(myText);
        System.out.println(myText2);
    }
}
