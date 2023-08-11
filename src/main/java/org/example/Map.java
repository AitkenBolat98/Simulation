package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Map {
    final int height;
    final int width;
    private Random random = new Random();
    HashMap<Coordinates, Entity> objectOnMap = new HashMap<>();

    public Map(int height, int width) {
        objectOnMap = new HashMap<>();
        this.height = height;
        this.width = width;
    }
    public void setPositions(List<Entity> entities){
        for(Entity entity:entities){
            int numberOnMap = random.nextInt(4);
            for(int numberOfEntity = 0; numberOfEntity < numberOnMap; numberOfEntity++){
                Coordinates coordinates = new Coordinates(random.nextInt(10),random.nextInt(10));
                setObjectsOnMap(coordinates,entity);
            } ;
        }
    }

    private void setObjectsOnMap(Coordinates coordinates, Entity entity){
        objectOnMap.put(coordinates, entity);
    }
    public void deleteObjectsFromMap(Coordinates coordinates){
        objectOnMap.remove(coordinates);
    }
    public boolean contains(Coordinates coordinates){
        return objectOnMap.containsKey(coordinates);
    }
    public Entity getEntity(Coordinates coordinates){
        return objectOnMap.get(coordinates);
    }
    public void changePositions(Coordinates newCoordinates){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Map map = (Map) o;
        return Objects.equals(objectOnMap, map.objectOnMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectOnMap);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
