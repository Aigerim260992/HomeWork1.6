package com.company;

public class Warrior extends Player {
     private int hit;

    public Warrior(int health, String damage, int hit) {
        super(health, damage);
        this.hit = hit;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }
}
