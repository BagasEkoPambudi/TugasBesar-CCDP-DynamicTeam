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
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoeRecommendationContext context = new ShoeRecommendationContext();

        ShoeRecommendationStrategy newShoesStrategy = new NewShoesStrategy();
        ShoeRecommendationStrategy popularShoesStrategy = new PopularShoesStrategy();

        context.setStrategy(newShoesStrategy);
        context.executeRecommendation();

        System.out.println("\nMengubah strategi menjadi sepatu populer:");
        context.setStrategy(popularShoesStrategy);
        context.executeRecommendation();
    }
    
}
