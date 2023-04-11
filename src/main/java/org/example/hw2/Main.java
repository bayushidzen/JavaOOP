package org.example.hw2;

import java.util.ArrayList;
import java.util.List;

import static org.example.hw2.Championship.createChampionship;

public class Main {
    public static void main(String[] args) {
        Human vasyaMan = new Human("Вася",55,9);

        /*List<Obstacle> championship1 = createChampionship();
        vasyaMan.runChampionship(championship1); Полосу препятствий не смог сделать
        не понял как можно сравнить длину или высоту препятствия
        из массива с возможностями участника */

        for(int i=0; i<=5;i++) {
            if (i % 2 == 0) {
                Barrier barrier = new Barrier();
                if (barrier.barrierHeight <= vasyaMan.jumpHeight) {
                    System.out.println(barrier);
                    vasyaMan.jump();
                }
                else {
                    System.out.printf("%s не смог перепрыгнуть преграду на %s метра %n",
                            vasyaMan.name, barrier.barrierHeight);
                    break;
                }
            } else {
                RunRoad runRoad = new RunRoad();
                if (runRoad.roadLength <= vasyaMan.runLength) {
                    System.out.println(runRoad);
                    vasyaMan.run();
                }
                else {
                    System.out.printf("%s не пробежал %s метров %n", vasyaMan.name, runRoad.roadLength);
                    break;
                }
            }
        }
    }

}
