package edu.guilford;

public class Dice {
 //attributes
    private int value;
    private int sides;
    
    //attributes
    public Dice(int sides) {
        this.sides = sides;
    }

    //methods
    public int roll() {
        value = (int) (Math.random() * sides) + 1;
        return value;
    }
    
 

}
