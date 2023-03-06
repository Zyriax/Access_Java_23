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
    }
}
