package Emil.Bostrom.Game;

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
            System.out.println(this.name + " successfully hits " + c.name);
            dealDamage(c, size * attack);
        } else
            {
                System.out.println(this.name + "misses" + c.name);
            }
    }

    @Override
    public String toString() {
        return "Character{" + "\n" +
                "name = " + name + "\n" +
                "health = " + health + "\n" +
                "attack = " + attack + "\n" +
                "defense = " + defense + "\n" +
                "speed = " + speed + "\n" +
                "size = " + size + "\n" +
                '}';
    }

    public void dealDamage(Character c, int amount) {
        c.health -= amount;

    }
}
