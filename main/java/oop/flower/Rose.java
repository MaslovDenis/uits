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
public class Rose extends Flower {
    static String nameRose = "Роза";
    int height;
    Rose(){
        super();
        height = 60;
        price = 25;
    }
    
    Rose(Color color){
        this.name = nameRose;
        height = 60;
        price = 25;
    }
    
    Rose(Color color, int height){
        this.name = nameRose;
        this.height = height;
        if (height<=60) price = 40;
        else if (height>60&&height<80) price = 60; 
        else price = 80;
    }
    
    }
