package uk.ac.cornwallcollege.emilbostrom.Game;

public class PlayableCharacter extends Character {

    String mood;
    int experience;



    public PlayableCharacter(int health, int attack, int defense, int speed, int size, String name) {
        super(health, attack, defense, speed, size, name);
    }

    @Override
    public String toString() {
        return name + " health: " + health + " mood: " + mood;
    }
}
