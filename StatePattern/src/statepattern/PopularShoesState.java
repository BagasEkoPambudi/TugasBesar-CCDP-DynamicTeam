/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author Bagas
 */
public class PopularShoesState implements ShoeRecommendationState {
    @Override
    public void showRecommendation() {
        System.out.println("Recommended Sepatu Populer!");
        // Logika untuk merekomendasikan sepatu populer
    }
}

