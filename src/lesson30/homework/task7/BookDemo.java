package lesson30.homework.task7;

import java.util.TreeSet;

/*
7. Создать класс Book с полями title, author и price.
Создать TreeSet с объектами класса Book и отсортировать его по цене в порядке убывания
 */
public class BookDemo {
    public static void main(String[] args) {


        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book("title 1" , "author 1" , 32.5));
        books.add(new Book("title 2" , "author 2" , 24.5));
        books.add(new Book("title 3" , "author 3" , 57.5));
        books.add(new Book("title 4" , "author 4" , 12.5));
        books.add(new Book("title 5" , "author 5" , 3.5));

        System.out.println(books);

    }
}
