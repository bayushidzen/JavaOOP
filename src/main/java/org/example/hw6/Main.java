package org.example.hw6;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Qwe", "Sf", 2012, 354, "GOOD");
        EBook ebook1 = new EBook("EDFA", "Sf", 2013, 855, "BAD", "txt", 9.5);
        BookGenre bookGenre1 = new BookGenre("horror");
        BookGenre bookGenre2 = new BookGenre("fantasy");
        Library liba = new Library();
        liba.setBook(book1);
        liba.setBook(ebook1);
        System.out.println("liba.findBookByAuthor(\"Sf\") = " + liba.findBookByAuthor("Sf"));
        Formatter formatToHTML = new HTMLFormat();
        Formatter formatToJSON = new JSONFormat();
        System.out.println(formatToHTML.format(book1));
        System.out.println("formatToJSON.format(ebook1) = " + formatToJSON.format(ebook1));


    }
}
