package org.example.hw3.BullsCows;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements GameInterface{
    Integer sizeWord;
    Integer tries;
    String word;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(int sizeWord, int tries) {
        this.sizeWord = sizeWord;
        this.tries = tries;
        word = generateWord();
        this.gameStatus = GameStatus.START;

    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;
        for(int i = 0; i < value.length(); i++){
            if(value.charAt(i) == word.charAt(i)){
                bulls++;
            }
            Character character = value.charAt(i);
            if(word.contains(character.toString())){
                cows++;
            }
        }
        return new Answer(value, cows, bulls);
    }

    @Override
    public GameStatus getGameStatus() {
        return null;
    }
    private String generateWord(){
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWorld = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWorld = resWorld.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWorld;
    }
    abstract List<String> generateCharList();
}
