/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templetemethodpattern;

/**
 *
 * @author Bagas
 */
public class TempleteMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShoeRecommendationTemplate newShoesRecommendation = new NewShoesRecommendation();
        ShoeRecommendationTemplate popularShoesRecommendation = new PopularShoesRecommendation();

        System.out.println("Recommendasi Untuk Sepatu Baru:");
        newShoesRecommendation.recommendShoes();

        System.out.println("\nRecommendasi Untuk Sepatu Populer:");
        popularShoesRecommendation.recommendShoes();
    }
    
}
