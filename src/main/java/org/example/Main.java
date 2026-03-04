package org.example;

import org.example.model.Warrior;

public class Main {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("Thor", 100, 20);
        Warrior w2 = new Warrior("Loki", 80, 15);

        w1.attack(w2);

    }
}