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
public class ShoeRecommendationContext {
    private ShoeRecommendationState state;

    public void setState(ShoeRecommendationState state) {
        this.state = state;
    }

    public void showRecommendation() {
        state.showRecommendation();
    }
}

