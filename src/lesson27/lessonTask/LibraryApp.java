package lesson27.lessonTask;

public class LibraryApp {
    public static void main(String[] args) {

    BookRepository books = new BookRepository();
    AuthorRepository authors = new AuthorRepository();
    GenreRepository genres = new GenreRepository();

    LibraryService service = new LibraryService(books,genres,authors);

        Book book1 = new Book("book1","author1","genre1");
        Book book2 = new Book("book2","author2","genre2");
        Book book3 = new Book("book3","author1","genre1");

        service.addBook(book1);
        service.addBook(book2);
        service.addBook(book3);

        System.out.println(books);
        System.out.println(authors);
        System.out.println(genres);
        System.out.println("==================================");
        System.out.println(service.getBooksByAuthor("author1"));
        System.out.println("==================================");
        System.out.println(service.getBooksByGenre("genre1"));
        System.out.println("==================================");
        service.removeBook(book1);

        System.out.println(books);

    }
}
