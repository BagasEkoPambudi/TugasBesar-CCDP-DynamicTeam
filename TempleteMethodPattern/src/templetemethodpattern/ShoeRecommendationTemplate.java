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
public abstract class ShoeRecommendationTemplate {

    public void recommendShoes() {
        System.out.println("Selamat Datang di Rekomendasi Sepatu:");
        showHeader();
        showRecommendation();
        showFooter();
    }

    protected abstract void showHeader();

    protected abstract void showRecommendation();

    protected abstract void showFooter();
}

