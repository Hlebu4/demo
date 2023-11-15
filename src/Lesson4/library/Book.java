package Lesson4.library;

/*
Написать программу, которая:
- оперирует объектами книга со следующими параметрами
- автор
- название книги
- количество страниц
- номер в каталоге
- параметр который показывает книга в хранилище или на руках

Нужно уметь создавать новые книги двумя способами:
- либо указывать только автора и название книги
в этом случае недостающе при создании книги данные добавляются отдельно
- либо полностью все параметры

 Написать отдельные сервисные методы которые:
 - создают новую книгу только с автором и названием
 - создают новую книгу с использованием всех параметров
 - редактирует книгу добавляя: номер каталога, количество страниц и где книга находится
 - который вывод подробно информацию о книге
*/


public class Book {

    public String author;
    public String name;
    public int pages;
    public int numberInCatalog;
    public boolean inLibrary;


    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }



    public Book(String author, String name, int pages, int numberInCatalog, boolean inLibrary) {
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.numberInCatalog = numberInCatalog;
        this.inLibrary = inLibrary;
    }
}


