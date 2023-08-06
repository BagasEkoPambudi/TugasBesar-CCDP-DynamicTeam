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
public class CommandPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoeRecommendationInvoker invoker = new ShoeRecommendationInvoker();
        ShoeRecommendation newShoes = new NewShoesCommand();
        ShoeRecommendation popularShoes = new PopularShoesCommand();

        invoker.setRecommendation(newShoes);
        invoker.executeRecommendation();

        invoker.setRecommendation(popularShoes);
        invoker.executeRecommendation();
    }
    
}
