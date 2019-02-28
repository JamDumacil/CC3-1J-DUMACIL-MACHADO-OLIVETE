package Test;


import Character.Kikiam;
import Character.Wizard;
import Character.Character;

/**
 *
 * @author m304user
 */
public class TestCharacter {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        //Create character objects
        Character char1 = new Wizard("Jamellah", 100,1,1);
        Character char2 = new Kikiam("Siomai Rice", 100,1,1);
        
        //Initialize variables
        int damage, round = 1;
        //Repeat until either character is dead or until round 3 is reached
        while(char1.getCurrentLife() > 0 && char2.getCurrentLife() > 0 && round <= 3) {
            //Print round number
            System.out.println("Round " + round);
            
            //Print characters' health
            System.out.println(char1.getName() + ": " + char1.getCurrentLife());
            System.out.println(char2.getName() + ": " + char2.getCurrentLife());
            
            //char1 attack char2
            damage = char1.attack();
            char2.wound(damage);
            System.out.println(char1.getName() + " attacks " + char2.getName() + " for " + damage);
            if (char2.getCurrentLife() <= 0) {
                System.out.println("");
                break;
            }
            
            //char2 attack char1
            damage = char2.attack();
            char1.wound(damage);
            System.out.println(char2.getName() + " attacks " + char1.getName() + " for " + damage);
            
            //Increase round number
            System.out.println("");
            round++;
            
        }
        
        //Print
        System.out.println(char1.getName() + ": " + char1.getCurrentLife());
        System.out.println(char2.getName() + ": " + char2.getCurrentLife());
        System.out.println("");
        
        if (char1.getCurrentLife() == char2.getCurrentLife()) {
            System.out.println("Draw.");
        } else if (char1.getCurrentLife() > char2.getCurrentLife()) {
            System.out.println(char1.getName() + " wins.");
        } else if (char2.getCurrentLife() > char1.getCurrentLife()) {
            System.out.println(char2.getName() + " wins.");
        }
    }
}
