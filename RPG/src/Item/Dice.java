package Item;

/**
* The Dice class models rolling a regular six-sided die
*/
import java.util.Random;

/**
 *
 * @author m304user
 */
public class Dice {
    /** instance variables */
    private final Random r;
    /**
    * Instantiate the object r
    */
    public Dice() {
        r = new Random();
    }
    /**
    * Returns a random integer between 1 and 6
     * @return integer representing dice roll result
    */
    public int roll() {
        return r.nextInt(6) + 1;
    }
}