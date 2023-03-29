package uk.ac.cornwallcollege.emilbostrom.Game;

public class TeamRocket extends NPC{

    public TeamRocket (int health, int attack, int defense, int speed, int size, String name) {
        super(health, attack, defense, speed, size, name);
    }

    @Override
    public void dealDamage(Character c4) {

    }

    @Override
    public void dealDamage(Character c, int amount) {
        c.health -= attack;

        c.health -= attack;

    }
}
