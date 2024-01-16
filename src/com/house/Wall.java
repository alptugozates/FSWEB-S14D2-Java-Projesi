package com.house;

public class Wall {

    String direction;

    public Wall(String direction){
     this.direction = direction;

    }

    public String getDirection() {
        return direction;
    }

    public void create() {
        System.out.println("Wall created with direction: " + direction);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "direction='" + direction + '\'' +
                '}';
    }
}
