/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.flower;

/**
 *
 * @author Дениска
 */
public class App {
    public static void main(String[] args) {
        Rose rose1 = new Rose(Color.White, 81);
        Rose rose2 = new Rose(Color.Red, 75);
        Camomile cam1 = new Camomile();
        
        Bouquet bouq = new Bouquet();
        bouq.add(1, rose2);
        bouq.add(1, rose1);
        bouq.add(5, cam1);
        bouq.showBouquet();
        System.out.println(bouq.getPrice());
       
    }
}
