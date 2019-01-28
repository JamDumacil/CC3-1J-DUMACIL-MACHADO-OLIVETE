/**
* The Character class models a character for a roleplaying game.
* A character has a name and 3 stats: strength, dexterity, and
intelligence, as
* well as maximum allowed life points and the current value.
*/
public class Character {
/** static variables */
static Dice dice = new Dice();
/** instance variables */
String name;
int strength, dexterity, intelligence;
int maxLife, currentLife;
/**
* Constructor takes 4 parameters: n,s,d,i and assigns them to
* instance variables name, strength, dexterity, intelligence.
* Also uses the dice instance to assign a random
* number to maxlife. currentlife is initialized to maxlife
*/
public Character(String n, int s, int d, int i) {
    name = n;
    strength = s;
    dexterity = d;
    intelligence = i;
    maxLife = dice.roll() * 10;
    currentLife = maxLife;
}
/**
* Returns a random die roll using the roll method in the
* Dice.java, *modified by the character's strength
*/
public int attack() {
    return dice.roll() * strength;
}
/**
* Decreases currentlife by the damage parameter
*/
public void wound(int damage) {
    currentLife -= damage;
}
/**
* Increases currentlife by the heal parameter.
* currentlife cannot be greater than maxlife
*/
public void heal(int heal) {
    if ((currentLife + heal) < maxLife)
        currentLife += heal;
    else
        currentLife = maxLife;
}
/**
* Returns name
*/
public String getName() {
    return name;
}
/**
* Returns strength
*/
public int getStrength() {
    return strength;
}
/**
* Returns dexterity
*/
public int getDexterity() {
    return dexterity;
}
/**
* Returns intelligence
*/
public int getIntelligence() {
    return intelligence;
}
/**
* Returns currentlife
*/
public int getCurrentLife() {
    return currentLife;
}
/**
* Returns maxlife
*/
public int getMaxLife() {
    return maxLife;
}
}