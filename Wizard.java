/**
* The Wizard class extends Character, adding two new instance
* variables: maxmagic, and currentmagic, as well as the
* castLightningBolt() and castHeal() methods, which represent
* casting magic spells.
*/
public class Wizard extends Character implements Weapon, Armor {
    /** instance variables */
    private int maxMagic, currentMagic;
    /**
    * The Wizard(String,int,int,int) constructor overrides the
    * constructor with the same signature in Character. It first
    * calls that constructor using the super keyword, then
    * initializes maxmagic to a value, and sets currentmagic to
    * the same value, similar to lifepoints.
    */
    public Wizard(String n, int s, int d, int i) {
        super(n, s, d, i);
        maxMagic = dice.roll() * 10;
        currentMagic = maxMagic;
    }
    /**
    * castLightningBolt() represents casting a magic spell. The
    * method first checks that currentmagic is greater than/equal
    * to 5. If it is, currentmagic is reduced by 5 and a random
    * number is returned using the dice inherited from Character,
    * modified by the character's intelligence.
    * Otherwise, returns 0.
    */
    public int castLightningBolt() {
        int damage = 0;
        if (currentMagic >= 5) {
            currentMagic -= 5;
            damage = dice.roll() * intelligence;
        }
        return damage;
    }
    /**
    * castHeal() represents casting a magic spell. The method first
    * checks that currentmagic is greater than/equal to 8. If it
    * is, currentmagic is reduced by 8 and the character's heal()
    * method is called with a random number, modified by the
    * character's intelligence score. The amount healed is also
    * returned by the method.
    */
    public int castHeal() {
        int healAmt = 0;
        if (currentMagic >= 8) {
            currentMagic -= 8;
            healAmt = dice.roll() * intelligence;
            heal(healAmt);
        }
        return healAmt;
    }
    /**
    * Returns maxmagic
    */
    public int getMaxMagic() {
        return maxMagic;
    }
    /**
    * Returns currentmagic
    */
    public int getCurrentMagic() {
        return currentMagic;
    }

    @Override
    public int attack() {
       return dice.roll() * strength;   
    }

    @Override
    public int useWeapon() {
        return dice.roll() * strength;
    }
    
    @Override
    public int useArmor() {
        int value = dice.roll() * strength;
        heal(value);
        return value;
    }
    
}