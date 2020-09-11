package ru.mirea;

import java.lang.Math;

public class Circle {
    
    private int radius;
    private double area;
    private double length;
    private float x_pos;
    private float y_pos;
    
    public Circle (int radius) {
        this.radius = radius;
    }
        
    public Circle (float x_pos, float y_pos, int radius) {
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.radius = radius;
        area = Math.PI * 2 * radius * radius;
    }
    
    public float GetX () {
        return x_pos;
    }
    
    public float GetY () {
        return y_pos;
    }
    
    public double GetCircleArea () {
        return area;
    }
  
    public void SetRadius (int radius) {
        this.radius = radius;
    }
    
    public double GetLength () {
        return radius * Math.PI * 2;
    }
    
    public void print () {
        System.out.println(this);
    }
    
    public String toString () {
        return "Circle: length = " 
               + length + ", x = " 
               + x_pos + ", y_pos = " 
               + y_pos + ", area = "
               + area;
    } 
}
