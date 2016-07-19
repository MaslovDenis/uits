/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Цветочница. Определить иерархию цветов. Создать
несколько объектовцветов.
Собрать букет
(используя аксессуары) с определением его
стоимости. Провести сортировку цветов в букете на
основе уровня свежести. Найти цветок в букете,
соответствующий заданному диапазону длин
стеблей.
 */
package oop.flower;

import java.util.ArrayList;

/**
 *
 * @author Дениска
 */
public class Bouquet {
    int price=0;
    int amount;
    Flower flower;
    ArrayList bouquet = new ArrayList();
 
    void add(int amount, Flower flower){
        for (int i = 0; i <amount; i++) {
            bouquet.add(flower);
            price +=flower.getPrice();
        }
    }
          
    void showBouquet(){
        int size=bouquet.size();
        Flower ob;
        for (int i = 0; i < size; i++) {
            ob=(Flower) bouquet.get(i);
            System.out.print(ob.getName()+" ");
        }
        System.out.println("");
    }
    
    int getPrice(){
        return price;
    }
    
}
