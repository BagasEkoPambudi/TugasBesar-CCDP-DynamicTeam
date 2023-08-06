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
public class PopularShoesStrategy implements ShoeRecommendationStrategy {
    @Override
    public void recommend() {
        System.out.println("Recommendasi Sepatu Populer:");
        // Logika untuk merekomendasikan sepatu populer
        System.out.println("1. Sepatu Populer X");
        System.out.println("2. Sepatu Populer Y");
        System.out.println("3. Sepatu Populer Z");
    }
}

