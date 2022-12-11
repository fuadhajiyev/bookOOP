package models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    int id;
    String bookName;
    Author author;
    Publisher publisher;
    List<BookInstance> bookInstances;

    public Book() {
    }

    public Book(int id, String bookName, Author author, Publisher publisher) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.bookInstances = new ArrayList<>();
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void addBookInstance(BookInstance bookInstance) {
        if (bookInstance.getBook().getId() != this.getId()) {
            throw new RuntimeException("The given book instance does not belong this requested book");
        }
        this.bookInstances.add(bookInstance);
    }

    public List<BookInstance> getBookInstances() {
        return bookInstances;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nBookName: %s\nAuthorName: %s\nPublisherName: %s",
                this.getId(),
                this.getBookName(),
                this.getAuthor().getAuthorName(),
                this.getPublisher().getPublisherName());
    }
}
