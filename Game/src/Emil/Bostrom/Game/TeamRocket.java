package Emil.Bostrom.Game;

public class TeamRocket extends NPC{

    public TeamRocket (int health, int attack, int defense, int speed, int size, String name) {
        super(health, attack, defense, speed, size, name);
    }

    @Override
    public String toString() {
        return "Team Rocket is go";
    }

    @Override
    public void dealDamage(Character c, int amount) {
        c.health -= attack;

        c.health -= attack;

    }
}