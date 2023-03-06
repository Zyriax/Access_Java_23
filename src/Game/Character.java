package Game;

public class character {
    int health;
    int attack;
    int defense;
    int speed;
    int size;

    String name;

    public void hit (character c) {
        int rnd = (Math.random() *10); //random number from 0 to 9

        if(rnd + attack > c.defense) {
            System.out.println(this.name" sucessfully hits " + c, name);
            c.dealDamage(c, size * attack);
        } else {
            System.out.println(this.name + "misses" + c.name);
        }

    }

    public void dealDamage(character c, int amount) {
        c.health -= amount;

    }
}
