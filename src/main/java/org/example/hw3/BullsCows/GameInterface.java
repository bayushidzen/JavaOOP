package org.example.hw3.BullsCows;

public interface GameInterface {

    void start(Integer sizeWord, Integer tries);
    void stop();
    void win();

    void setTries(int i);
    Integer getSizeOfWord();
    Answer inputValue(String value);
    GameStatus getGameStatus();
    Integer getTries();
}
