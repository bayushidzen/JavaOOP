package org.example.hw2;

import java.util.ArrayList;
import java.util.List;

public class Championship {
    List<Obstacle> championshipList;

    public static List<Obstacle> createChampionship(){
        List<Obstacle> championshipList = new ArrayList<>();
        for(int i=0; i<=5;i++){
            if(i%2==0) championshipList.add(new Barrier());
            else championshipList.add(new RunRoad());
        }
        System.out.println(championshipList);
        return championshipList;
    }
}
