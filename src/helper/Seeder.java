package helper;

import models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Seeder {

    /**
     * This function generates a list of authors
     * @param count - The number of requested authors
     * @return - The list of authors
     */
    public static List<Author> generateAuthors(int count) {
        List<Author> authors = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            Author author = new Author(i, "AuthorName"+i);
            authors.add(author);
        }

        return authors;
    }


    /**
     * This function generates a list of publishers
     *
     * @param count - the number of requested publishers
     * @return - List of publishers
     */
    public static List<Publisher> generatePublishers(int count) {
        List<Publisher> publishers = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            Publisher publisher = new Publisher(i, "PublisherName" + i);
            publishers.add(publisher);
        }

        return publishers;
    }


    /**
     * This function generates a list of stores with the given number of branches
     * @param countStore - The number of requested Stores
     * @param countBranchForEachStore - The number of requested Branches for each Store
     * @return
     */
    public static List<Store> generateStores(int countStore, int countBranchForEachStore) {
        List<Store> stores = new ArrayList<>();

        for (int i = 1; i <= countStore; i++) {
            Store store = new Store(i, "PublisherName" + i);

            for (int j = 1; j <= countBranchForEachStore ; j++) {
                int id = Integer.parseInt(i+""+j);
                Branch branch = new Branch(id, "BranchName"+i+j, store);
                store.addBranch(branch);
            }

            stores.add(store);
        }

        return stores;
    }

    /**
     * This function generates a list of book with the given count, possible publishers and authors
     *
     * @param count - the number of books
     * @param possiblePublishers - A random publisher will be picked from this list to create a book
     * @param possibleAuthors - Random authors will be picked from this list to create a book
     * @return List<Book> - The list of books
     */
    public static List<Book> generateBooks(int count, List<Publisher> possiblePublishers, List<Author> possibleAuthors) {
        List<Book>  books = new ArrayList<>();

        Random random = new Random();

        for (int i = 1; i <= count; i++) {
            Publisher publisher = possiblePublishers.get(random.nextInt(possiblePublishers.size()));
            Author author = possibleAuthors.get(random.nextInt(possibleAuthors.size()));
            Book book = new Book(i, "BookName"+i, author, publisher);
            books.add(book);
        }

        return books;

    }


    /**
     * This function generates a list of books instances for each given book in the number {eachBookInstanceCount}
     * @param eachBookInstanceCount - The number of book instances
     * @param books - List for book instances will be generated for
     * @param possibleStores - Book instances will be assigned to these possible stores
     * @return - The list of Book Instances
     */
    public static List<BookInstance> generateBookInstances(int eachBookInstanceCount, List<Book> books, List<Store> possibleStores) {
        List<BookInstance> bookInstances = new ArrayList<>();

        Random random = new Random();
        for (Book book: books) {
            for (int i = 1; i <= eachBookInstanceCount; i++) {
                Store randomStore = possibleStores.get(random.nextInt(possibleStores.size()));
                Branch randomBranch = randomStore.getBranches().get(random.nextInt(randomStore.getBranches().size()));
                BookInstance bookInstance = new BookInstance(UUID.randomUUID().toString(), book, randomBranch, random.nextBoolean());
                book.addBookInstance(bookInstance);
                bookInstances.add(bookInstance);
            }
        }

        return bookInstances;
    }
}
