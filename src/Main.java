import models.Book;
import models.Branch;

import java.util.List;

import static helper.Seeder.*;

public class Main {
    public static void main(String[] args) {

     List<Book> books = generateBooks( "Edebiyyat", "Prof.Sabir", "Baki neshriyyat evi");
     List<Book> books2 = generateBooks( "Riyaziyyat", "Prof.Namazov", "Baki neshriyyat evi");

        generateBookInstances(20, books, "genclikMall", "ali-nino",true);



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