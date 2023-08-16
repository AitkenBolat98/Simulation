package org.example;

abstract public class Creature extends Entity{
    private int speed;
    private int healthPoints;
    public abstract void makeMove(Coordinates currentCoordinates,Map map);

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
