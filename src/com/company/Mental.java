package com.company;

public class Mental extends Player implements SuperAbilityble{
     private String AttackType;

    public Mental(int health, String damage, String attackType) {
        super(health, damage);
        this.AttackType = attackType;
    }

    public String getSos() {
        return AttackType;
    }

    public void setSos(String AttackType) {
        this.AttackType = AttackType;
    }

    @Override
    public void drow() {
        System.out.println("\uD83D\uDCA1");

    }
}
