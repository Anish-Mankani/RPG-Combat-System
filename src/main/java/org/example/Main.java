package org.example;

import org.example.model.Mage;
import org.example.model.Warrior;

public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thor", 120, 20);
        Mage mage = new Mage("Gandalf", 80, 15, 50);

        while (warrior.isAlive() && mage.isAlive()) {

            warrior.attack(mage);

            if (mage.isAlive()){
                mage.attack(warrior);
            }
            System.out.println("Warrior health: " + warrior.getHealth());
            System.out.println("mage health: " + mage.getHealth());
            System.out.println("------------------------");
        }

        if (warrior.isAlive()) {
            System.out.println(" Warrior Wins!");
        } else {
            System.out.println("Mage Wins");
        }

    }
}