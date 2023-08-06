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
public class ShoeRecommendationContext {
    private ShoeRecommendationStrategy strategy;

    public void setStrategy(ShoeRecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeRecommendation() {
        strategy.recommend();
    }
}

