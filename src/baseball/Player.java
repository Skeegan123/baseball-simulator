/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.util.Random;

/**
 *
 * @author Keegans Laptop
 */

public class Player {
    
    String name;
    float hit = 0;
    float base = 0;
    float total = 0;
    float walks = 0;
    
    public Player(String name) {
        this.name = name;
    }
    
    public void atBat(int times) {
        Random rand = new Random();
        
        for (int i = 0; i < times; i ++) {
            int rand_int = rand.nextInt(4);
            
            
            if (rand_int == 0) {
                //hit
                this.hit += 1;
                this.base += 1;
                this.total += 1;
                
                System.out.println(this.name + " comes to bat and gets a hit!");
            }
            
            else if (rand_int == 1) {
                //out
                this.total += 1;
                
                System.out.println(this.name + " comes to bat and gets out.");
            }
            
            else if (rand_int == 2) {
                //error
                this.base += 1;
                this.total += 1;
                
                System.out.println(this.name + " comes to bat and gets on base by a defensive error.");
            }
            
            else if (rand_int == 3) {
                //walk
                this.base += 1;
                this.walks += 1;
                System.out.println(this.name + " comes to bat and gets four balls for a free pass.");
            }
        }
        
        System.out.println();
    }
    
    public void compute() {
        float totalw = this.total + this.walks;
        float perc = this.hit / this.total;
        float bb = this.base / totalw;
        System.out.print(this.name + " batting average would  be " + this.hit + " for " + this.total + " or ");
        System.out.printf("%.3f", perc);
        System.out.println();
        System.out.print(this.name + " OB% would  be " + this.base + " for " + totalw + " or ");
        System.out.printf("%.3f", bb);
        System.out.println();
        System.out.println();
    }
}
