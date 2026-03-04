package org.example.model;

public class Warrior extends GameCharacter {


    public Warrior(String name, int health, int strength) {
        super(name, health, strength);
    }

    @Override
    public void attack() {

        System.out.println(name + " swings sword dealing " + strength + " damage!");
    }


}
