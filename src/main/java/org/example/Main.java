package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Predator predator = new Predator(2,4);
        Herbivore herbivore = new Herbivore(1,5);
        Rock rock = new Rock();
        Tree tree = new Tree();
        Grass grass = new Grass();

        List<Entity> entityList = new ArrayList<>();
        entityList.add(predator);
        entityList.add(herbivore);
        entityList.add(rock);
        entityList.add(tree);
        entityList.add(grass);
        Map map = new Map(10,10);
        Renderer renderer = new Renderer();
        map.setInitialPositions(entityList);
        renderer.printMap(map);
    }
}