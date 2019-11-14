package com.company;

public class Warrior extends Player implements SuperAbilityble{


     private int hit;

    public Warrior(int health, String Attacktype, int hit) {
        super(health, Attacktype);
        this.hit = hit;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    @Override
    public void drow() {
        System.out.println("⚔");

    }
}
