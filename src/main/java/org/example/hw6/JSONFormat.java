package org.example.hw6;

public class JSONFormat implements Formatter{
    @Override
    public String format(Book book) {
        return "Книга " + book.getName() + " отформатирована в JSON";
    }
}
