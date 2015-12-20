package bowlinggame;

import nl.tjang.kata.bowlinggame.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    BowlingGame game;

    @Before
    public void setup(){
        game = new BowlingGame();
    }

    @Test
    public void testGutterGame(){
        for (int rolls = 0; rolls < 10; rolls++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }

    @Test
    public void testAllOnes(){
        rollMany(20, 1);
        assertEquals(20, game.score());
    }

    @Test
    public void testSpareFrame(){
        game.roll(5);
        game.roll(5);
        game.roll(3);
        assertEquals(16, game.score());
    }

    @Test
    public void testStrikeFrame(){
        game.roll(10);
        game.roll(5);
        assertEquals(20, game.score());
    }

    @Test
    public void testPerfectGame(){
        rollMany(12, 10);
        assertEquals(300, game.score());
    }

    public void rollMany(int count, int pins){
        for (int i = 0; i < count; i++) {
            game.roll(pins);
        }
    }
}
