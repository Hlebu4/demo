package lesson24.homework.task3;

import java.util.HashMap;

public class Task3 {
    /*
    **Словарь перевода слов:**
    - Создайте `HashMap`, где ключом является слово на английском языке, а значением - его перевод на другой язык.
    - Добавьте в словарь пять пар слов.
    - Выведите перевод слова, введенного пользователем.
    - Удалите слово из словаря и выведите обновленный список слов.
     */

    public static void main(String[] args) {

        HashMap<String,String> dictionary = new HashMap<>();
        UserInput ui = new UserInput();

        dictionary.put("apple","яблоко");
        dictionary.put("pear","груша");
        dictionary.put("cherry","черешня");
        dictionary.put("watermelon","арбуз");
        dictionary.put("plum","слива");

        System.out.println(dictionary);

        String findByKey = dictionary.get(ui.userInputText("enter key"));
        System.out.println(findByKey);

        dictionary.remove(ui.userInputText("enter key for delete"));
        System.out.println(dictionary);

    }
}
