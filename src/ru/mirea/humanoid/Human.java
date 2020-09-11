package ru.mirea.humanoid;

import java.util.Arrays;

public class Human {
    public String name;
    
    private Leg[] legs = {new Leg("Left"), new Leg("Right")};
    private Hand[] hands = {new Hand("Left"), new Hand("Right")};
    private Head head = new Head();
    
    public Human (String name) {
        this.name = name;
    }
    
    public void print () {
        System.out.println(this);
    }
    
    public String toString () {
        return "Human: name = " + name + " Legs" + Arrays.toString(legs) + ", Hands" 
                + Arrays.toString(hands) + ", Head - " + head.toString();
    }
}
