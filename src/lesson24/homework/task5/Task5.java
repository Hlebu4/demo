package lesson24.homework.task5;

import java.util.SortedMap;

/*
Уникальный набор имен:**
    - Создайте `HashSet` для хранения имен.
    - Добавьте в набор десять имен, некоторые из которых могут повторяться.
    - Выведите количество уникальных имен в наборе.
    - Проверьте, содержит ли набор определенное имя.
 */
public class Task5 {
    public static void main(String[] args) {

        Repository repository = new Repository();

        repository.getNames().add(new Names("Vova").getName());
        repository.getNames().add(new Names("Sasha").getName());
        repository.getNames().add(new Names("Sweta").getName());
        repository.getNames().add(new Names("Petya").getName());
        repository.getNames().add(new Names("Dasha").getName());
        repository.getNames().add(new Names("Vova").getName());
        repository.getNames().add(new Names("Max").getName());
        repository.getNames().add(new Names("Sasha").getName());
        repository.getNames().add(new Names("Max").getName());
        repository.getNames().add(new Names("Sergey").getName());

        System.out.println(repository);

        System.out.println(" number of unique names = " + repository.getNames().size());
        System.out.println(" serch by name Max - " + repository.getNames().contains("Max"));
        System.out.println(" serch by name Maxi - " + repository.getNames().contains("Maxi"));
    }

}
