package lesson27.lessonTask;

import java.util.List;
import java.util.Set;

public class LibraryService {
    /*
    addBook

    getBooksByAuthor

    getBooksByGenre

    removeBook
     */

    private final BookRepository books;
    private final GenreRepository genres;
    private final AuthorRepository authors;

    public LibraryService(BookRepository books, GenreRepository genres, AuthorRepository authors) {
        this.books = books;
        this.genres = genres;
        this.authors = authors;
    }

    public void addBook (Book book){
        books.addBook(book);
        genres.addBookToGenre(book);
        authors.addAuthor(book);
    }

    public Set<Book> getBooksByAuthor (String author){
        return authors.getBooksByAuthor(author);
    }

    public List<Book> getBooksByGenre (String genre){
        return genres.getBooksByGenre(genre);
    }

    public void removeBook (Book book){
        authors.removeBook(book);
        genres.removeBookFromGenre(book);
        books.removeBook(book);
    }
}
