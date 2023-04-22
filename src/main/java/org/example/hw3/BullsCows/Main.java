package org.example.hw3.BullsCows;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            menu();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Выберите игру: ");
            int num = scanner.nextInt();
            GameInterface game = null;

            switch (num) {
                case 1:
                    game = new NumberGame();
                    break;
                case 2:
                    game = new EnGame();
                    break;
                case 3:
                    game = new RuGame();
                    break;
                case 0:
                    System.out.println("Игра завершена, ждём вас снова!");
                    break;

                default:
                    System.out.println("Данная игра ещё не добавлена");
            }
            game.start(1, 10);
            int counter = 0;
            while (game.getGameStatus().equals(GameStatus.START)) {
                System.out.printf("Ход: %d Попытки: %d \n", counter, game.getTries());
                String answer = scanner.nextLine();
                Answer answerGame = game.inputValue(answer);
                game.setTries(game.getTries() - 1);
                counter++;
                System.out.println("Коров - " + answerGame.getCows() +
                        " , быков - " + answerGame.getBulls());
                if (game.getTries() == 0) {
                    System.out.println("Вы проиграли, попытки закончились");
                    game.stop();
                    System.out.println("Хотите ли сыграть ещё раз?\n" +
                            " 1 - Да \n" +
                            " 2 - Нет");
                    int restart = scanner.nextInt();
                    if (restart == 1) {
                        menu();
                    } else {
                        break;
                    }
                    ;
                }
                if (answerGame.getBulls() == game.getSizeOfWord()) {
                    System.out.println("Вы победили");
                    game.win();
                    System.out.println("Хотите ли сыграть ещё раз?\n" +
                            " 1 - Да \n" +
                            " 2 - Нет");
                    int restart = scanner.nextInt();
                    if (restart == 1) {
                        menu();
                    } else {
                        break;
                    }
                    ;
                }
            }

        }

        public static void menu() {
            System.out.flush();
            System.out.println("--------------------МЕНЮ ИГРЫ--------------------\n" +
                    "1 - игра с цифрами\n" +
                    "2 - игра с английский алфавитом\n" +
                    "3 - игра с русским алфавитом\n" +
                    "0 - выйти из игры\n" +
                    "-------------------------------------------------");
        }
}