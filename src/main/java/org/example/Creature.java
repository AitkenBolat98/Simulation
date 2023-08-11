package org.example;

abstract public class Creature extends Entity{
    public int speed;
    public int healthPoints;
    public abstract void makeMove(Coordinates coordinates,Map map);

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
