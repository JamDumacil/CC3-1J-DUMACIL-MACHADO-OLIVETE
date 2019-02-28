package Character;


import Item.Dice;

/**
* The Character class models a character for a roleplaying game.
* A character has a name and 3 stats: strength, dexterity, and
intelligence, as
* well as maximum allowed life points and the current value.
*/
public abstract class Character {
    /** static variables */
    protected static Dice dice = new Dice();
    /** instance variables */
    protected String name;
    /** instance variables */
    protected int strength,
    /** instance variables */
    dexterity,
    /** instance variables */
    intelligence;
    /** instance variables */
    protected int maxLife,
    /** instance variables */
    currentLife;
    /**
    * Constructor takes 4 parameters: n,s,d,i and assigns them to
    * instance variables name, strength, dexterity, intelligence.
    * Also uses the dice instance to assign a random
    * number to maxlife. currentlife is initialized to maxlife
     * @param n name
     * @param s strength
     * @param d dexterity
     * @param i intelligence
    */
    public Character(String n, int s, int d, int i) {
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        maxLife = dice.roll() * 10;
        currentLife = maxLife;
    }
    /** attack abstract method
     * @return integer representing attack */
    public abstract int attack();
            
    /**
    * Decreases currentlife by the damage parameter
     * @param damage damage
    */
    public void wound(int damage) {
        if ((currentLife - damage) > 0)
            currentLife -= damage;
        else
            currentLife = 0;
    }
    /**
    * Increases currentlife by the heal parameter.
    * currentlife cannot be greater than maxlife
     * @param heal heal
    */
    public void heal(int heal) {
        if ((currentLife + heal) < maxLife)
            currentLife += heal;
        else
            currentLife = maxLife;
    }
    /**
    * Returns name
     * @return String representing name
    */
    public String getName() {
        return name;
    }
    /**
    * Returns strength
     * @return integer representing strength
    */
    public int getStrength() {
        return strength;
    }
    /**
    * Returns dexterity
     * @return integer representing dexterity
    */
    public int getDexterity() {
        return dexterity;
    }
    /**
    * Returns intelligence
     * @return integer representing intelligence
    */
    public int getIntelligence() {
        return intelligence;
    }
    /**
    * Returns currentlife
     * @return integer representing current life
    */
    public int getCurrentLife() {
        return currentLife;
    }
    /**
    * Returns maxlife
     * @return integer representing max life
    */
    public int getMaxLife() {
        return maxLife;
    }
}