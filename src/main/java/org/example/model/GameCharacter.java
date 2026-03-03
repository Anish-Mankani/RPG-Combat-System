package org.example.model;

public abstract class GameCharacter {

    protected String name;
    protected int health;
    protected int strength;

    public GameCharacter(String name, int health,int strength ) {
        this.name = name;
        this.health = health;
        this.strength = strength;

    }

    public  abstract void attack();

    public void takeDamage (int damage) {
            health -= damage;
    }
}


