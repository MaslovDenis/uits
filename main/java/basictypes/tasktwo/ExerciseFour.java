/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes.tasktwo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Дениска
 */
public class ExerciseFour {
    public static void main(String[] args) {
        int sum3=0,sum7=0;
        Random random=new Random();
        int arrLen=random.nextInt(10);
        int arr[];
        arr=new int [arrLen];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*99);
        }
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Обратный порядок:");
        for (int x = arr.length-1; x>=0; x--) {
            System.out.print(arr[x]+" ");
        }
        
        System.out.println("\nЧетные:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print(arr[i]+" ");
            }
        }
        
        System.out.println("\nНечетные:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0) {
                System.out.print(arr[i]+" ");
            }
            if (arr[i]%7==0) {
                sum7+=arr[i];
            }
            if (arr[i]%3==0) {
                sum3*=arr[i];
            }
        }
        System.out.println("");
        System.out.println("Summa 7="+sum7);
        System.out.println("Proizvedenie 3="+sum3);
                
    }
    
}

