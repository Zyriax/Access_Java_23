package uk.ac.cornwallcollege.emilbostrom.Game;

public class Giovanni extends NPC {

    public Giovanni (int health, int attack, int defense, int speed, int size, String name) {
        super(health, attack, defense, speed, size, name);
    }

    @Override
    public void dealDamage(Character c4) {
        c4.health -= attack *3;
    }
}
