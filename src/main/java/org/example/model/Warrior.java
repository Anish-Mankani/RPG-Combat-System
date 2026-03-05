package org.example.model;

import java.util.Random;

public class Warrior extends GameCharacter {


    public Warrior(String name, int health, int strength) {
        super(name, health, strength);
    }

    @Override
    public void attack(GameCharacter target) {

        Random random = new Random();
        int damage = random.nextInt(strength) + 1;

        System.out.println(name + " attacks " + target.getName() +
                " dealing " + strength + " damage!");
        target.takeDamage(damage);
    }


}
