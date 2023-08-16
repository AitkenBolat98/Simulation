package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Map {
    public Map(Integer width, Integer height) {
        this.width = width;
        this.height = height;
    }

    private Integer width;
    private Integer height;
    final Integer numberOfPredators = 2;
    final Integer numberOfHerbivores = 2;
    final Integer numberOfGrass = 2;
    final Integer numberOfRocks = 2;
    final Integer numberOfTrees = 2;
    Random random = new Random();

    private HashMap<Coordinates,Entity> map = new HashMap<>();

    public void setInitialPositions(List<Entity> entities){
        for(Entity entity:entities){
            switch (entity.getName()){
                case "H":
                    for (int i = 0; i < numberOfHerbivores;i++){
                        Coordinates coordinates = new Coordinates(random.nextInt(10)
                                                                ,random.nextInt(10));
                        map.put(coordinates,entity);
                        break;
                    }
                case "P":
                    for (int i = 0; i < numberOfPredators;i++){
                        Coordinates coordinates = new Coordinates(random.nextInt(10)
                                ,random.nextInt(10));
                        map.put(coordinates,entity);
                        break;
                    }
                case "G":
                    for (int i = 0; i < numberOfGrass;i++){
                        Coordinates coordinates = new Coordinates(random.nextInt(10)
                                ,random.nextInt(10));
                        map.put(coordinates,entity);
                        break;
                    }
                case "R":
                    for (int i = 0; i < numberOfRocks;i++){
                        Coordinates coordinates = new Coordinates(random.nextInt(10)
                                ,random.nextInt(10));
                        map.put(coordinates,entity);
                        break;
                    }
                case "T":
                    for (int i = 0; i < numberOfTrees;i++){
                        Coordinates coordinates = new Coordinates(random.nextInt(10)
                                ,random.nextInt(10));
                        map.put(coordinates,entity);
                        break;
                    }
                default:
                    System.out.println("such object does not exist");
            }
        }
    }
    public Entity getAllEntitiesOfType(Entity entity){
        map.
    }
    public void deleteEntity(Coordinates coordinates){
        map.remove(coordinates);
    }
    public boolean contains(Coordinates coordinates){
        return map.containsKey(coordinates);
    }
    public Entity checkOccupiedType(Coordinates coordinates){
        Entity entity = getEntity(coordinates);
        return entity;
    }
    public Entity getEntity(Coordinates coordinates){
        return map.get(coordinates);
    }
    public void setPosition(Coordinates coordinates,Entity entity){
        map.put(coordinates,entity);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Map map1 = (Map) o;
        return Objects.equals(map, map1.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
