package com.company;

public class Boss extends Player {
    private String bossDefenceType;

    public Boss(int health, String damage) {
        super(health, damage);
    }

    public String getBossDefenceType() {
        return bossDefenceType;
    }

    public void setBossDefenceType(String bossDefenceType) {
        this.bossDefenceType = bossDefenceType;
    }
}
