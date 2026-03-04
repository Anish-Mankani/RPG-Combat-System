    package org.example.model;

    public class Mage extends GameCharacter {
        private int mana;

        public Mage(String name, int health, int strength, int mana) {
            super(name, health, strength);
            this.mana = mana;
        }

        @Override
        public void attack(GameCharacter target) {
            if (mana >= 10) {
                int damage = strength + 10;

                System.out.println(name + " casts Fireball at "
                                + target.getName()
                                + " dealing " + damage + " damage");

                target.takeDamage(damage);
                mana -= 10;

            } else {
                System.out.println(name + "tried to cast Fireball but has not enough mana!");
            }
        }
    }
