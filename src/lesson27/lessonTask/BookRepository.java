package lesson27.lessonTask;


import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<Book> books = new ArrayList<>();



    public void addBook (Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public void removeBook (Book book){
        books.remove(book);
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }
}
