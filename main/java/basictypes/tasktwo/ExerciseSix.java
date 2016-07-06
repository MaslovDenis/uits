/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes.tasktwo;

import java.util.Arrays;

/**
 *Используя циклические конструкции и массивы создать “рваный массив”
треугольной формы, реализовать вывод данного массива в виде треугольника в
консоль. Реализовать методы, отражающие данный “треугольник”
● по горизонтали
● по вертикали
● по горизонтали и вертикали одновременно
 * @author Дениска
 */
public class ExerciseSix {
    
    public static void main(String[] args) {
        String arr [][];
        arr=new String[10][];
        System.out.println("вывод данного массива в виде треугольника");
        for (int i = 0; i < 10; i++) {
            arr[i]=new String[i+1];
            for (int j = 0; j < i+1; j++) {
                arr[i][j]="*";
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
        printAflat(arr);
        printUpright(arr);
        printUprightAflat(arr);
    }
    
    public static void printAflat(String [][] x){
        System.out.println("по вертикали");
        for (int i =x.length-1 ; i>=0; i--) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void printUpright (String [][] x){
        System.out.println("по горизонтали");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j <(x[x.length-1].length-x[i].length) ; j++) {
                System.out.print(" ");
            }
            for (int j = x[i].length-1; j >=0 ; j--) {
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void printUprightAflat (String [][] x){
        System.out.println("по горизонтали и вертикали одновременно");
        for (int i = x.length-1; i >= 0; i--) {
            for (int j = 0; j <(x[x.length-1].length-x[i].length) ; j++) {
                System.out.print(" ");
            }
            for (int j = x[i].length-1; j >=0 ; j--) {
                System.out.print(x[i][j]);
            }
            System.out.println("");
        }
    }
}
