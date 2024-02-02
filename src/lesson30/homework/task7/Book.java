package lesson30.homework.task7;

public class Book implements Comparable<Book>{

    private String title;
    private String author;
    private Double price;

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book newBook) {
        return (int)(getPrice() - newBook.getPrice()) * (-1);
    }
}
