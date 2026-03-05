package org.example;

import org.example.model.GameCharacter;
import org.example.model.Mage;
import org.example.model.Warrior;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thor", 120, 20);
        Mage mage = new Mage("Gandalf", 80, 15, 50);
        GameCharacter dragon = new Warrior("Dragon", 200, 25);

        ArrayList<GameCharacter> party = new ArrayList<>();

        party.add(warrior);
        party.add(mage);

        while (dragon.isAlive()) {

            System.out.println("\n--- New Round ---");

            // Heroes attack dragon
            for (GameCharacter hero : party) {
                if (hero.isAlive()) {
                    hero.attack(dragon);
                }
            }

            if (!dragon.isAlive()) {
                System.out.println("\nHeroes defeated the Dragon!");
                break;
            }

            // Dragon attacks heroes
            for (GameCharacter hero : party) {
                if (hero.isAlive()) {
                    dragon.attack(hero);
                }
            }

            // Check if all heroes died
            boolean allDead = true;

            for (GameCharacter hero : party) {
                if (hero.isAlive()) {
                    allDead = false;
                    break;
                }
            }

            if (allDead) {
                System.out.println("\nDragon has defeated all heroes!");
                break;
            }
        }
    }
}