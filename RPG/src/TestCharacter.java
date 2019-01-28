/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author m304user
 */
public class TestCharacter {
    public static void main(String args[]) {
        Character char1 = new Character("Jamellah", 1,1,1);
        Character char2 = new Character("Dumacil", 1,1,1);
        
        int damage, round = 1;
        while(char1.getCurrentLife() > 0 && char2.getCurrentLife() > 0) {
            //Print round number
            System.out.println("Round " + round);
            
            //Print characters' health
            System.out.println(char1.getName() + ": " + char1.getCurrentLife());
            System.out.println(char2.getName() + ": " + char2.getCurrentLife());
            
            //char1 attack char2
            damage = char1.attack();
            char2.wound(damage);
            System.out.println(char1.getName() + " attacks " + char2.getName() + " for " + damage);
            
            //char2 attack char1
            damage = char2.attack();
            char1.wound(damage);
            System.out.println(char2.getName() + " attacks " + char1.getName() + " for " + damage);
            
            //Increase round number
            System.out.println("");
            round++;
            
            //char1 heal
            float rand = char1.dice.roll();
            if (rand > 3) {
                
            }
            
        }
        if (char1.getCurrentLife() <= 0) {
            System.out.println(char2.getName() + " wins.");
        } else if (char2.getCurrentLife() <= 0) {
            System.out.println(char1.getName() + " wins.");
        }
    }
}
