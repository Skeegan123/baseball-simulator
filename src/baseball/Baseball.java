/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

/**
 *
 * @author Keegans Laptop
 */
public class Baseball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player keegan = new Player("Keegan Gaffney");
        Player chance = new Player("Chance Jones");
        Player alexis = new Player("Alexis Palmer");
        
        keegan.atBat(10);
        keegan.compute();
        chance.atBat(10);
        chance.compute();
        alexis.atBat(10);
        alexis.compute();
    }
    
}
