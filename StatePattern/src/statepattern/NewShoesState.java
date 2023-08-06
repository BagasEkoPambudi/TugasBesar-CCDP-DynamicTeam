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
public class NewShoesState implements ShoeRecommendationState {
    @Override
    public void showRecommendation() {
        System.out.println("Rekomendasi New Arrival Sepatu!");
        // Logika untuk merekomendasikan sepatu baru
    }
}

