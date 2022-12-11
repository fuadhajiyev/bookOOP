package data;

import helper.Seeder;
import models.Author;
import models.Book;
import models.BookInstance;
import models.Publisher;
import models.Store;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    private List<Author> authors;
    private List<Publisher> publishers;
    private List<Store> stores;
    private List<Book> books;
    private List<BookInstance> bookInstances;

    public Repository() {
        this.authors = Seeder.generateAuthors(100);
        this.publishers = Seeder.generatePublishers(20);
        this.stores = Seeder.generateStores(100, 5);

        this.books = Seeder.generateBooks(500, this.publishers, this.authors);
        this.bookInstances = Seeder.generateBookInstances(100, this.books, this.stores);
    }

    public BookInstance findBookInstance(String serialNumber) {
        for (BookInstance instance: this.bookInstances) {
            if (instance.getSerialNumber().equals(serialNumber)) {
                return instance;
            }
        }

        return null;
    }

    public List<BookInstance> findBookInstancesByAuthorName(String authorName) {
        List<BookInstance> foundBookInstances = new ArrayList<>();

        for (Book book: this.books) {
            if (book.getAuthor().getAuthorName().equals(authorName)) {
                foundBookInstances.addAll(book.getBookInstances());
            }
        }

        return foundBookInstances;
    }

    public List<BookInstance> findBookInstancesByPublisherName(String publisherName) {
        List<BookInstance> foundBookInstances = new ArrayList<>();

        for (Book book: this.books) {
            if (book.getPublisher().getPublisherName().equals(publisherName)) {
                foundBookInstances.addAll(book.getBookInstances());
            }
        }

        return foundBookInstances;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Publisher> getPublishers() {
        return publishers;
    }

    public List<Store> getStores() {
        return stores;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<BookInstance> getBookInstances() {
        return bookInstances;
    }
}
