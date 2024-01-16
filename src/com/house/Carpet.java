package com.house;

import com.house.Enums.PaintColor;

import java.awt.*;

public class Carpet {

    private final PaintColor paintColor;
    private int width;
   private int height;


    public Carpet(int width, int height, PaintColor paintColor){
        this.width = width;
        this.height = height;
        this.paintColor = paintColor;
    }

    public PaintColor getPaintColor() {
        return paintColor;
    }

    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "paintColor=" + paintColor +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
