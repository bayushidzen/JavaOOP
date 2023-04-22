package org.example.hw3.BullsCows;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {

    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            charList.add(String.valueOf((char)i));
        }
        return charList;
    }

    @Override
    public Integer getSizeOfWord() {
        return sizeWord;
    }
}
