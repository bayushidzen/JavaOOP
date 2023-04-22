package org.example.hw3.BullsCows;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i <= 9 ; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }

    @Override
    public Integer getSizeOfWord() {
        return sizeWord;
    }
}
