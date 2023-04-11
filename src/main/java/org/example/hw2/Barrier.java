package org.example.hw2;

public class Barrier extends Obstacle {
    Integer barrierHeight;

    public Barrier() {
        this.barrierHeight = (int)(Math.random()*10);
    }

    public Integer getBarrierHeight() {
        return barrierHeight;
    }

    public void setBarrierHeight(Integer barrierHeight) {
        this.barrierHeight = barrierHeight;
    }

    @Override
    public String toString() {
        return "Барьер на " + barrierHeight + " метров ";
    }
}
