/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author Bagas
 */
public class NewShoesStrategy implements ShoeRecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("Rekomendasi untuk Sepatu Baru:");
        // Logika untuk merekomendasikan sepatu baru
        System.out.println("1. Sepatu Model A");
        System.out.println("2. Sepatu Model B");
        System.out.println("3. Sepatu Model C");
    }
}

