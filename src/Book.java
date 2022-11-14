import java.util.Objects;

public class Book {
    private final String bookName;
    private final String author;
    private final int publishYear;

    public Book(String bookName, String author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    public int hashcode() {
        return Objects.hash(bookName, author, publishYear);
    }

    public String toString() {
        return "Book{" +
                " bookName = '" + bookName + '\''  +
                ", author = " + author +
                ", publishYear " + publishYear +
                '}';
    }
}
