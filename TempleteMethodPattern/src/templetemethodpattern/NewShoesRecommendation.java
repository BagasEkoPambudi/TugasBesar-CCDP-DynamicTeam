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
public class NewShoesRecommendation extends ShoeRecommendationTemplate {

    @Override
    protected void showHeader() {
        System.out.println("Check out Sepatu Kami Terbaru:");
    }

    @Override
    protected void showRecommendation() {
        // Logika untuk merekomendasikan sepatu baru
        System.out.println("1. Sepatu Model A");
        System.out.println("2. Sepatu Model B");
        System.out.println("3. Sepatu Model C");
    }

    @Override
    protected void showFooter() {
        System.out.println("Kunjugi Toko Kami!");
    }
}

