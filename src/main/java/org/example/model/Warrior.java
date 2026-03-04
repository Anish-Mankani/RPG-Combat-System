package org.example.model;

public class Warrior extends GameCharacter {


    public Warrior(String name, int health, int strength) {
        super(name, health, strength);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(name + " attacks " + target.name +
                " dealing " + strength + " damage!");
        target.takeDamage(strength);
    }


}
