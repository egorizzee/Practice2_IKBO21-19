package ru.mirea;

import ru.mirea.humanoid.*;

public class Main {
    
    public static void main (String[] args) {
        Circle circle = new Circle(10);
        
        circle.print();
        System.out.println(circle.GetCircleArea());
        
        Human human = new Human("Олег");
        human.print();
    }
}
