package org.example.hw6;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Library implements Searchable {
    private List<Book> allBooks = new ArrayList<>();

    @Override
    public List<Book> findBookByAuthor(String author) {
        List<Book> searchResult = new ArrayList<>();
        for (Book b: allBooks) {
            if(b.getAuthor().equals(author)){
                searchResult.add(b);
            }
        }
        return searchResult;
    }

    @Override
    public List<Book> findBookByGenre(BookGenre bookGenre) {
        List<Book> searchResult = new ArrayList<>();
        for (Book b: allBooks) {
            if(b.getBookGenre().getGenreName().equals(bookGenre.getGenreName())){
                searchResult.add(b);
            }
        }
        return searchResult;
    }

    public void setBook(Book book){
        allBooks.add(book);
    }
}
