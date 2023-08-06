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
public class NewShoesCommand implements ShoeRecommendation {
    @Override
    public void execute() {
        System.out.println("Rekomendasi new arrivals Sepatu!");
        // Logika untuk merekomendasikan sepatu baru
    }
}

