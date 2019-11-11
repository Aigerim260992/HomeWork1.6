package com.company;

public class Mental extends Player{
     private int sos;

    public Mental(int health, String damage, int sos) {
        super(health, damage);
        this.sos = sos;
    }

    public int getSos() {
        return sos;
    }

    public void setSos(int sos) {
        this.sos = sos;
    }
}
