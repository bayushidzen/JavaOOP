package org.example.hw2;

public class RunRoad extends Obstacle{
    Integer roadLength;

    public RunRoad(){
        this.roadLength = (int)(Math.random()*100);
    }

    public Integer getRoadLength() {
        return roadLength;
    }

    public void setRoadLength(Integer roadLength) {
        this.roadLength = roadLength;
    }

    @Override
    public String toString() {
        return "Беговая дорога на " + roadLength + " метров";
    }
}
