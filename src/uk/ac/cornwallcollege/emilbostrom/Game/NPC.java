package uk.ac.cornwallcollege.emilbostrom.Game;

public abstract class NPC extends Character {

    public NPC(int health, int attack, int defense, int speed, int size, String name) {
        super(health, attack, defense, speed, size, name);
    }

    public abstract void dealDamage(Character c4);
}
