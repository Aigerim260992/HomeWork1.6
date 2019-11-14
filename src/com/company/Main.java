package com.company;

public class Main {

    public static void main(String[] args) {


        Warrior warrior = new Warrior(50, "physycal", 20);
        warrior.drow();

        Magic magic = new Magic(50, "15", "Magical");
        magic.drow();

        Mental mental = new Mental(50, "25", "Kinetical");
        mental.drow();


    }
}

