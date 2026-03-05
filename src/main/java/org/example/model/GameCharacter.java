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

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public  abstract void attack(GameCharacter target);



    public void takeDamage (int damage) {
            health -= damage;
            if (health < 0) {
                health = 0;
            }
    }
}


