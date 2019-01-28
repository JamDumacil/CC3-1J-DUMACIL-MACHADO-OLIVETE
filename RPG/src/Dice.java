/**
* The Dice class models rolling a regular six-sided die
*/
import java.util.Random;
public class Dice {
    /** instance variables */
    private Random r = new Random();
    /**
    * Instantiate the object r
    */
    public Dice() {
    }
    /**
    * Returns a random integer between 1 and 6
    */
    public int roll() {
        return r.nextInt(6) + 1;
    }
}