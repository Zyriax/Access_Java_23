package uk.ac.cornwallcollege.emilbostrom.Game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void testCharacterCreation() {
        Character c1 = new Character(  50,  50,  20, 5,  1,  "Zorro" );

    }

    @Test
    public void testHitting () {
        Character c1 = new Character(  50,  15,  20, 5,  1,  "Zorro" );

        Character c2 = new Character(  50,  50,  0, 5,  1,  "Sheep" );

        c1.hit(c2);
        assertEquals(35, c2.health);
        System.out.println("Test successfully passed, health is "+c2.health);
    }

    @Test
    public void testPlayableCharacter() {
        PlayableCharacter c3 = new PlayableCharacter( 50, 55, 20, 5, 2, "Mega");
        assertEquals(0, c3.experience);
    }

    @Test
    public void testGiovanni() {
        Character c1 = new Character(  50,  15,  20, 5,  1,  "Zorro" );

        Character c4 = new Character(  75,  50,  35, 10,  1,  "Giovanni" );
        c4.hit(c1);
    }
}

