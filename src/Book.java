import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishYear;

    public Book(String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
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

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author.toString() +
                ", publishYear=" + publishYear +
                '}';
    }
}

