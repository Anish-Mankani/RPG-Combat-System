    package org.example.model;

    import java.util.Random;

    public class Mage extends GameCharacter implements SpecialSkill {
        private int mana;

        public Mage(String name, int health, int strength, int mana) {
            super(name, health, strength);
            this.mana = mana;
        }

        @Override
        public void attack(GameCharacter target) {

            Random random = new Random();
            int damage = random.nextInt(strength) + 1;

            if (mana >= 10) {
                System.out.println(name + " casts Fireball at "
                                + target.getName()
                                + " dealing " + damage + " damage");

                target.takeDamage(damage);
                mana -= 10;

            } else {
                System.out.println(name + " attacks with staff!");
                target.takeDamage(damage);
            }
        }

        @Override
        public void useSpecialSkill(GameCharacter target) {

            if (mana >= 20) {
                int damage = strength + 20;

                System.out.println(name + " uses Meteor Strikes on " +
                        target.getName()
                        + " dealing " + damage + " damage");

                target.takeDamage(damage);
                mana -= 20;
            } else {
                System.out.println(name + "tried to cast Meteor strikes but has not enough mana!");
            }

        }
    }
