package org.example;

import java.util.Random;

public class Herbivore extends Creature {
    private Random random;

    public Herbivore(int speed, int healthPoints) {
        setSpeed(speed);
        setHealthPoints(healthPoints);
        setName("H");
    }

    @Override
    public void makeMove(Coordinates currentCoordinates, Map map) {
        while (true) {
            Integer verticalShift = random.nextInt(getSpeed());
            Integer horizontalShift = random.nextInt(getSpeed());
            Coordinates newCoordinates = new Coordinates(currentCoordinates.vertical + verticalShift,
                    currentCoordinates.horizontal + horizontalShift);
            if (isCellAvailable(newCoordinates, map) == true && isOutOfBounds(newCoordinates) == false) {
                Entity entity = map.getEntity(currentCoordinates);
                map.deleteEntity(currentCoordinates);
                map.setPosition(newCoordinates,entity);
                break;
            }

        }
    }

    public void eatGrass(Coordinates coordinates, Map map) {
        map.deleteEntity(coordinates);
    }


    private boolean isCellAvailable(Coordinates coordinates, Map map) {
        Entity entity = map.checkOccupiedType(coordinates);
        switch (entity.getName()) {
            case "P":
                System.out.println("Predator on new cell");
                return false;
            case "H":
                System.out.println("Herbivore on new cell");
                return false;
            case "R":
                System.out.println("Rock on new cell");
                return false;
            case "T":
                System.out.println("Tree on new cell");
                return false;
            case "G":
                System.out.println("Grass on new cell");
                eatGrass(coordinates, map);
                return true;
            default:
                System.out.println("cell is Empty");
                return true;
        }

    }

    private boolean isOutOfBounds(Coordinates coordinates){
        if(coordinates.vertical < 11 && coordinates.horizontal < 11){
            return false;
        }else {
            return true;
        }
    }
}