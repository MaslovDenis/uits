/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes.tasktwo;

import java.util.Scanner;

/**
 *
 * @author Дениска
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        String [] numberText = {" ","один","два","три","четыри","пять","шесть","семь",
            "восемь","девять","десять","одиннадцать","двенадцать","тринадцать","четырнадцать",
            "пятнадцать","шестнадцать","семнадцать","восемнадцать","девятнадцать"};
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число:");
        String x =sc.next();
        String text = null;
        int number =Integer.parseInt(x);
        
        int numLeft=number/10;
        int numRight=number-(numLeft*10);
        
        if (number<20){
        text=numberText[number];
        }
        else {
        switch (numLeft){
            case 2:{
                text=(numberText[numLeft]+"дцать"+" ");
                        }break;
            case 3:{
                text=(numberText[numLeft]+"дцать"+" ");
                        }break; 
            case 4:{
                text=("сорок"+" ");
                        }break;
            case 5:{
                text=(numberText[numLeft]+"десят"+" ");
                        }break;
            case 6:{
                text=(numberText[numLeft]+"десят"+" ");
                        }break;
            case 7:{
                text=(numberText[numLeft]+"десят"+" ");
                        }break; 
            case 8:{
                text=(numberText[numLeft]+"десят"+" ");
                        }break;
            default:{
                text=("девяносто"+" ");
            }
        }
        }
        
        System.out.println(text+numberText[numRight]);
    }
    
}
