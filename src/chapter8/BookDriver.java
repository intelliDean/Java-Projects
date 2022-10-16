package chapter8;

import java.util.EnumSet;

public class BookDriver {
    public static void main(String[] args) {
         System.out.println("All books:");
            // print all books in enum Book
         for (Book book : Book.values() ) {
             System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
         }

         System.out.printf("%nDisplay a range of enum constants:%n");

            // print first four books
         for (Book book : EnumSet.range(Book.JHTP, Book.IW3HTP)) { // Range takes two parameters, the beginning and the end
             System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear() );
         }
    }
}
