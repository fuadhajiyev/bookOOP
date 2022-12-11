import models.Book;
import models.BookInstance;
import models.Publisher;

import java.util.List;

public class Printer {

    public static <T> void printList(List<T> items) {
        System.out.println("####### The list of elements #######");
        for (T item: items) {
            System.out.println();
            System.out.println(item);
            System.out.println("\n*******************************");
        }

        System.out.println("####### List ended #######");
    }


    public static <T> void print(T object) {
        System.out.println("##### The result");
        System.out.println(object);
        System.out.println("\n*******************************");
    }

    public static void printReport(List<BookInstance> bookInstances) {
        System.out.println("###### The Result ######");
        System.out.println("Found: " + bookInstances.size());
        System.out.println("Sold: " + bookInstances.stream().filter(BookInstance::getOutOfStock).count());
        System.out.println("In Stock: " + bookInstances.stream().filter(b -> !b.getOutOfStock()).count());
    }

}
