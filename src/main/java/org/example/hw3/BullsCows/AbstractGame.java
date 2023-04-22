package org.example.hw3.BullsCows;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class AbstractGame implements GameInterface{
    Integer sizeWord;
    Integer tries;
    String word;
    GameStatus gameStatus = GameStatus.INIT;

    @Override
    public void start(Integer sizeWord, Integer tries) {
        this.sizeWord = sizeWord;
        this.tries = tries;
        word = generateWord();
        this.gameStatus = GameStatus.START;

    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public AbstractGame(Integer sizeWord) {
        this.sizeWord = sizeWord;
    }

    @Override
    public void stop() {
        this.gameStatus = GameStatus.LOSE;
    }

    @Override
    public void win() {
        this.gameStatus = GameStatus.WIN;
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
        return this.gameStatus;
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
