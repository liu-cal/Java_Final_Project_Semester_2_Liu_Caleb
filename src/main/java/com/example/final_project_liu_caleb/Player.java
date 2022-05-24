package com.example.final_project_liu_caleb;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Player extends Rectangle{
    private double posX;
    private double posY;

    //no-arg constructor
    public Player(){
        super(25,100,Color.BLACK);
    }

    //arg constructor
    public Player(double posX, int w, int h, Color c){
        super(w,h,c);
        this.posX=posX;
    }

    //returns the position of X
    public double getPosX() {
        return posX;
    }

    //sets the position of Y
    public void setPosY(double posY) {
        this.posY = posY;
    }

    //returns the position of X
    public double getPosY(){
        return posY;
    }

    //mouse control for player on the left
    public void movement(Canvas c){
        c.setOnMouseMoved(e->posY=e.getY());
    }

}
