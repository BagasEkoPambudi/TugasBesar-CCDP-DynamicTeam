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
public class StatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoeRecommendationContext context = new ShoeRecommendationContext();
        
        ShoeRecommendationState newState = new NewShoesState();
        ShoeRecommendationState popularState = new PopularShoesState();

        context.setState(newState);
        context.showRecommendation();

        context.setState(popularState);
        context.showRecommendation();
    }
    
}
