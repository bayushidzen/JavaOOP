package org.example.hw3.BullsCows;

public interface GameInterface {

    void start(int sizeWord, int tries);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}
