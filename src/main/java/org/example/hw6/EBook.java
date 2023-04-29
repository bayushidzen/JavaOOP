package org.example.hw6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EBook extends Book{
    String format;
    Double size;

    public EBook(String name, String author, Integer year, Integer pages, String publisher, String format, Double size) {
        super(name, author, year, pages, publisher);
        this.format = format;
        this.size = size;
    }
}
