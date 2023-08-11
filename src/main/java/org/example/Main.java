package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map map = new Map(10,10);
        Herbivore herbivore = new Herbivore(2,5);
        Predator predator = new Predator(3,3);
        Grass grass = new Grass();
        Tree tree = new Tree();
        Rock rock = new Rock();
        List<Entity> entities = new ArrayList<>();
        entities.add(herbivore);
        entities.add(grass);
        entities.add(tree);
        entities.add(rock);
        entities.add(predator);
        map.setPositions(entities);
        Renderer renderer = new Renderer();

        renderer.printMap(map);
    }
}