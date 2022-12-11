package helper;

import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Seeder {

    // kitab yaratmaq random
    public static List<Book> generateBooks(String bookName, String authorName, String publishName) {
        int randomId = randomId();
        List<Book> books = new ArrayList<>();
        List<Author> authors = new ArrayList<>();
        authors.add(new Author(randomId, authorName));
        books.add(new Book(randomId, bookName, authors, new Publisher(randomId, publishName)));


        return books;

    }

    // kitab nusxelerin yaratmaq
    public static List<BookInstance> generateBookInstances(int bookCount, List<Book> books, String branchName, String storeName, boolean isStock) {
        List<BookInstance> bookInstanceList = new ArrayList<>();
        int randomId = randomId();
        List<Branch> branch = (List<Branch>) new Branch(randomId, branchName);
        Store store = new Store(randomId, storeName, branch);



        for (int i = 0; i < bookCount; i++) {
            bookInstanceList = (List<BookInstance>) new BookInstance("AA" + randomId(), books.get(0), branch.get(0), isStock);

        }

        return bookInstanceList;


    }


    static public int randomId() {
        Random random = new Random();
        int num = 0;

        num = random.nextInt(999999999);

        return num;
    }

}
