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
public class Flower {
    String name;
    Color color;
    int price;
    
    Flower (){
        name = "Цветок";
        color = color.White;
        price = 10;
    }
    
    Flower (Color color){
        this.color = color;
        price = 10;
    }
    
    Flower(Color color,int price){
        
        this.color = color;
        this.price = price;
    }
    
    Flower(String name, Color color, int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
    
    int getPrice(){
        return price;
    }
    
    String getName(){
        return name;
    }
    
    Color getColor(){
        return color;
    }

}
