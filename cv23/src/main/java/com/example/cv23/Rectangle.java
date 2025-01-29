package com.example.cv23;

public class Rectangle {
    public double posX = 100;
    public double posY = 100;

    public void up() {
        posY--;
    }

    public void down() {
        posY++;
    }

    public void left() {
        posX--;
    }

    public void right() {
        posX++;
    }
}
