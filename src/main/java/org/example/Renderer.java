package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Renderer {

    public void printMap(Map map){
        System.out.print("   |");
        for (int i = 0; i < map.getHeight(); i++) {
            System.out.print("Y " + i + "|");
        }
        System.out.println();
        for (int i = 0; i < map.getHeight(); i++) {
            System.out.print("X " + i + "|");
            for (int j = 0; j < map.getWidth(); j++) {
                Coordinates coordinates = new Coordinates(i,j);
                if (map.contains(coordinates)) {
                    System.out.print(" " + map.getEntity(coordinates).getName() + " |");
                } else {
                    System.out.print("   |");
                }
            }
            System.out.println();
        }
        System.out.println("__________________________________________");
    }
}

