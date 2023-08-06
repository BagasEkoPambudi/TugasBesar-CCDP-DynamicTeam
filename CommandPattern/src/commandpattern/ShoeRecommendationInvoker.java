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
public class ShoeRecommendationInvoker {
    private ShoeRecommendation recommendation;

    public void setRecommendation(ShoeRecommendation recommendation) {
        this.recommendation = recommendation;
    }

    public void executeRecommendation() {
        recommendation.execute();
    }
}

