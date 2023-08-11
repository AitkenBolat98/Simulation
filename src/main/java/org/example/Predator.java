package org.example;

public class Predator extends Creature{

    public Predator(int speed, int healthPoints){
        this.setName("P");
        setSpeed(speed);
        setHealthPoints(healthPoints);
    }
    @Override
    public void makeMove(Coordinates coordinates,Map map) {

    }


}
