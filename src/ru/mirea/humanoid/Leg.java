package ru.mirea.humanoid;


public class Leg {
    private String legOrientation;
    
    public Leg (String legOrientation) {
        this.legOrientation = legOrientation;
    }
    
    public String toString () {
        return legOrientation + " leg";
    }
}
