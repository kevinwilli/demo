package edu.guilford;

public class Dice {
 //attributes
    private int value;
    private int sides;

    //constructors
    public Dice() {
        sides = 6;
    }

    //attributes
    public Dice(int sides) {
        this.sides = sides;
    }

    //getters
    public int getValue() {
        return value;
    }

    //methods
    public int roll() {
        value = (int) (Math.random() * sides) + 1;
        return value;
    }

    public String toString() {
        return "Dice [value=" + value + ", sides=" + sides + "]";
    }
 

}
