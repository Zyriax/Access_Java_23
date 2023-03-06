package uk.ac.cornwallcollege.emilbostrom.Game;

public class Character {
    int health;
    int attack;
    int defense;
    int speed;
    int size;

    String name;

    public Character(int health, int attack, int defense, int speed, int size, String name) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.size = size;
        this.name = name;
    }

    public void hit (Character c) {
        int rnd = (int)(Math.random() *10); //random number from 0 to 9

        if(rnd + attack > c.defense) {
            System.out.println(this.name + " sucessfully hits " + c.name);
            dealDamage(c, size * attack);
        } else {
            System.out.println(this.name + "misses" + c.name);
        }

    }

    public void dealDamage(Character c, int amount) {
        c.health -= amount;

    }
}
