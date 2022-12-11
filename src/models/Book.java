package models;

import java.util.List;

public class Book {
    int id;
    String bookName;// Cinayet ve ceza
    List<Author> authors; // dostoyevski
    Publisher publisher; // baki neshriyyat

    public Book() {
    }

    public Book(int id, String bookName, List<Author> authors, Publisher publisher) {
        this.id = id;
        this.bookName = bookName;
        this.authors = authors;
        this.publisher = publisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "models.Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authors=" + authors +
                ", publisher=" + publisher +
                '}';
    }
}
