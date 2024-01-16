package com.house;

import com.house.Enums.PaintColor;

public class Ceiling {
    private final PaintColor paintedColor;
    private int height;
   private PaintColor paintColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    // Method to get the painted color of the ceiling
    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create() {
        String paintedColor = null;
        System.out.println("Ceiling created with height: " + height + " and painted color: " + paintedColor);
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "paintedColor=" + paintedColor +
                ", height=" + height +
                ", paintColor=" + paintColor +
                '}';
    }
}
