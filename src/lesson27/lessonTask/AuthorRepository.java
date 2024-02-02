package lesson27.lessonTask;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AuthorRepository {

    private Map<String, Set<Book>> authorsBooks = new HashMap<>();


    public void addAuthor(Book book) {
        String author = book.getAuthor();
        if (!authorsBooks.containsKey(author)) {
            authorsBooks.put(author, new HashSet<>());
        }
        authorsBooks.get(author).add(book);
    }

    public Set<Book> getBooksByAuthor(String author) {
        return authorsBooks.getOrDefault(author, new HashSet<>());
    }

    public void removeBook(Book book) {
        String author = book.getAuthor();
        if (authorsBooks.containsKey(author)) {
            authorsBooks.get(author).remove(book);
            if (authorsBooks.get(author).isEmpty()) {
                authorsBooks.remove(author);
            }
        }
    }

    @Override
    public String toString() {
        return "AuthorRepository{" +
                "authorsBooks=" + authorsBooks +
                '}';
    }
}
