/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes.tasktwo;

import java.util.Arrays;
import java.util.Random;

/**
 *Создать двумерный массив m на n элементов, заполнить его случайными
числами. Реализовать методы, позволяющие:
●+ распечатать массив в прямом и обратном порядке
●+ для каждой четной строки вывести все четные элементы массива
●+ для каждого нечетного столбца вывести все нечетные элементы массива
●+ сумму всех элементов, кратных 7 в четных строках
●+ произведение элементов, кратных 3 в нечетных строках
 * 
 * @author Дениска
 */
public class ExerciseFive {
    
    public static void main(String[] args) {
        Random random=new Random();
        int arrLine=random.nextInt(4)+1;
        int arrCol=random.nextInt(10);       
        int arr[][]= new int[arrLine][arrCol];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int)(Math.random()*99);
            }
        }
        print (arr);
        System.out.println("для каждой четной строки вывести все четные элементы массива");
        printEven(arr);
        printOdd(arr);
        sum7(arr);
        multi3(arr);
        
    }
    static void print(int x[][]){
        System.out.println(Arrays.deepToString(x));
        for (int i = x.length-1; i >=0; i--) {
            for (int j = x[i].length-1; j >= 0; j--) {
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    static void printEven(int x[][]) {
        for (int i = 2; i<x.length+2; i+=2) {
            for (int j = 0; j <x[i-2].length; j++) {
                if (x[i-2][j]%2==0) {
                    System.out.print(x[i-2][j]+" ");
                }
            }
            System.out.println("");
        }
    }
    
    static void printOdd(int x[][]) {
        System.out.println("для каждого нечетного столбца вывести все нечетные элементы массива");
        for (int i=2; i<x[0].length+2; i+=2){
            for (int j = 0; j <x.length; j++) {
                if (x[j][i-2]%2!=0) {
                    System.out.print(x[j][i-2]+" ");
                }
            }
        }
        System.out.println("");
    }
    
    static void sum7(int x[][]){
        System.out.print("сумма всех элементов, кратных 7 в четных строках: ");
        int sum=0;
        for (int i = 2; i<x.length+2; i+=2) {
            for (int j = 0; j <x[i-2].length; j++) {
                if (x[i-2][j]%7==0) {
                    sum=sum+x[i-2][j];
                }
            }
        }
        System.out.println(sum);
    }
    
    static void multi3(int x[][]){
        System.out.print("произведение элементов, кратных 3 в нечетных строках: ");
        int sum=1;
        for (int i = 1; i<x.length; i+=2) {
            for (int j = 0; j <x[i].length; j++) {
                if (x[i][j]%3==0) {
                    sum=sum*x[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
