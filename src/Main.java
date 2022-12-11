import data.Repository;
import models.Book;
import models.BookInstance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.List;

import static helper.Seeder.generateBookInstances;
import static helper.Seeder.generateBooks;

public class Main {
    public static void main(String[] args) throws IOException {

        Repository repository = new Repository();

        boolean exit = false;
        while(!exit) {
            System.out.println();
            System.out.println("Press 1 to list books");
            System.out.println("Press 2 to list instances");
            System.out.println("Press 3 to list authors");
            System.out.println("Press 4 to list publishers");
            System.out.println("Press 5 to find book instance by serial number");
            System.out.println("Press 6 to generate report by authorName");
            System.out.println("Press 7 to generate report by publisherName");
            System.out.println("Press anything else to exit");

            System.out.print("Type (waiting...): ");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            int code = Integer.parseInt(reader.readLine());
            if (code == 1) {
                Printer.printList(repository.getBooks());
            } else if (code == 2) {
                Printer.printList(repository.getBookInstances());
            } else if (code == 3) {
                Printer.printList(repository.getAuthors());
            } else if (code == 4) {
                Printer.printList(repository.getPublishers());
            } else if (code == 5) {
                System.out.print("Type serial number(waiting...): ");
                String serialNumber = reader.readLine();
                BookInstance bookInstance = repository.findBookInstance(serialNumber);
                Printer.print(bookInstance);
            } else if (code == 6) {
                System.out.print("Type author name(waiting...): ");
                String authorName = reader.readLine();
                List<BookInstance> bookInstances = repository.findBookInstancesByAuthorName(authorName);
                Printer.printReport(bookInstances);
            } else if (code == 7) {
                System.out.print("Type publisher name(waiting...): ");
                String publisherName = reader.readLine();
                List<BookInstance> bookInstances = repository.findBookInstancesByPublisherName(publisherName);
                Printer.printReport(bookInstances);
            }  else {
                exit = true;
            }
        }


    }
}


//              Home Work 2

//    String text = "Qarabag Azerbaycandir ... !";
//    char findCharacter = 'a';
//    int count = 0;
//
//        for (int i = 0; i < text.length(); i++) {
//        char character = text.charAt(i);
//        if (findCharacter == character) {
//        count++;
//        }
//        }
//        System.out.println(count);