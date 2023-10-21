package org.example;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.ArrayList;
import java.util.Random;

public class MyGdxGame extends ApplicationAdapter {
    ShapeRenderer shapeRenderer;
    ArrayList<Point> points;
    Random random;


    @Override
    public void create() {
        Gdx.graphics.setWindowedMode(800,600);
        random = new Random();
        points = new ArrayList<>();
        for(int i = 0;i<300;i++){
            points.add(new Point(random.nextInt(800 - 1) + 1,random.nextInt(600 - 1) + 1));
        }
        for(Point point : points){
            point.setRandomColor();
        }
        shapeRenderer = new ShapeRenderer();
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);


    }

    @Override
    public void render() {

        for(Point point : points){
            point.randomize();
        }
        shapeRenderer.begin(ShapeRenderer.ShapeType.Point);
        for(Point point : points){
            shapeRenderer.setColor(point.getColor());
            shapeRenderer.point(point.getX(),point.getY(),0);
        }
        shapeRenderer.end();
    }

    @Override
    public void dispose() {
        shapeRenderer.dispose();
    }
}