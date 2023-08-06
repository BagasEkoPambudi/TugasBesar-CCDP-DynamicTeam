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
public class PopularShoesRecommendation extends ShoeRecommendationTemplate {

    @Override
    protected void showHeader() {
        System.out.println("Temukan sepatu kami yang paling populer:");
    }

    @Override
    protected void showRecommendation() {
        // Logika untuk merekomendasikan sepatu populer
        System.out.println("1. Sepatu Populer Model X");
        System.out.println("2. Sepatu Populer Model Y");
        System.out.println("3. Sepatu Populer Model Z");
    }

    @Override
    protected void showFooter() {
        System.out.println("Dapatkan ini sebelum mereka terjual!");
    }
}

