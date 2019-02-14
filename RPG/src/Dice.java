/**
* The Dice class models rolling a regular six-sided die
*/
import java.util.Random;
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
     * @return 
    */
    public int roll() {
        return r.nextInt(6) + 1;
    }
}