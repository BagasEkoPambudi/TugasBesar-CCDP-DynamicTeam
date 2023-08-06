/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author Bagas
 */
public class PopularShoesCommand implements ShoeRecommendation {
    @Override
    public void execute() {
        System.out.println("Recommended Sepatu Populer!");
        // Logika untuk merekomendasikan sepatu populer
    }
}

