package org.example;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;


import java.util.Random;

public class Point {


    private int x;
    private int y;
    private Color color;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setRandomColor() {
        Color[] COLORS = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE, Color.BROWN,Color.FIREBRICK,Color.CORAL,
                Color.PURPLE, Color.PINK, Color.GOLD, Color.SCARLET, Color.FOREST, Color.SKY};
        Random random = new Random();
        Color randomColor = COLORS[random.nextInt(COLORS.length)];
        this.color = randomColor;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
    }

    public void randomize() {
        Random rand = new Random();
        int randomValueX = rand.nextInt(3) - 1;
        int randomValueY = rand.nextInt(3) - 1;
        this.x += randomValueX;
        this.y += randomValueY;

        if (this.x < 0) {
            this.x = Gdx.graphics.getWidth();
        }
        if (this.x > Gdx.graphics.getWidth()) {
            this.x = 0;
        }

        if (this.y < 0) {
            this.y = Gdx.graphics.getHeight();
        }
        if (this.y > Gdx.graphics.getHeight()) {
            this.y = 0;
        }
    }
}
