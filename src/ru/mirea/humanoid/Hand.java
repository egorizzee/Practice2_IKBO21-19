package ru.mirea.humanoid;


public class Hand {
    private String handOrientation;
    
    public Hand (String handOrientation) {
        this.handOrientation = handOrientation;
    }
    
    public String toString () {
        return handOrientation + " hand";
    }
}
