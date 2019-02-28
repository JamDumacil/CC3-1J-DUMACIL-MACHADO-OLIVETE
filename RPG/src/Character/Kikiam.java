package Character;


import Item.Weapon;
import Item.Armor;

/**
* The Kikiam class extends Character, adding the
* castDeepFry() method, which represents
* casting a special attack.
*/
public class Kikiam extends Character implements Weapon, Armor {
    /**
    * The Kikiam(String,int,int,int) constructor overrides the
    * constructor with the same signature in Character. It
    * calls that constructor using the super keyword.
     * @param n name
     * @param s strength
     * @param d dexterity
     * @param i intelligence
    */
    public Kikiam(String n, int s, int d, int i) {
        super(n, s, d, i);
    }
    /**
    * castDeepFry() represents casting a special attack. The
    * method returns a random number using the dice inherited
    * from Character, modified by the character's dexterity.
    * The number is also used in the heal method to heal
    * the character at the same time
     * @return integer representing cast deep fry damage
    */
    public int castDeepFry() {
        int damage = dice.roll() * dexterity;
        heal (damage);
        return damage;
    }

    /**
    * Returns a random die roll using the roll method in the
    * Dice.java, *modified by the character's strength
     * @return integer representing attack damage
    */
    @Override
    public int attack() {
       return dice.roll() * strength;   
    }

    /**
    * Returns a random die roll using the roll method in the
    * Dice.java, *modified by the character's strength
     * @return integer representing use weapon damage
    */
    @Override
    public int useWeapon() {
        return dice.roll() * strength;
    }

    /**
    * Returns a random die roll using the roll method in the
    * Dice.java, *modified by the character's strength and
    * uses that value in the heal method to heal the character
     * @return integer representing use armor amount
    */
    @Override
    public int useArmor() {
        int value = dice.roll() * strength;
        heal(value);
        return value;
    }
}