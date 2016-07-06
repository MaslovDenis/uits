/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Реализовать приложение, которое производит операции циклического сдвига
над прямоугольным массивом (матрицей). Организовать методы, которые позволяют
произвести сдвиг:
● на n позиций влево
● на n позиций вправо
● на n позиций вверх
● на n позиций вниз
 */
package basictypes.tasktwo;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Дениска
 */
public class ExerciseSeven {
    public static void main(String[] args) {
        Random random=new Random();
        int arrLine=random.nextInt(4)+2;
        int arrCol=random.nextInt(4)+2;       
        int arr[][]= new int[arrLine][arrCol];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int)(Math.random()*99);
            }
        }
        
        Scanner sc=new Scanner(System.in);
        int route;
        do {
        System.out.println("Введите направление сдвига "
                + "(вправо - 1, влево - 2, вверх - 3, вниз - 4): ");
        String  r =sc.next();
        route =Integer.parseInt(r);
        } while (route>4);
        
        int position;
        System.out.println("Укажите количество позиций для сдвига: ");
        String  p =sc.next();
        position =Integer.parseInt(p);
        System.out.println("До сдвига:\n"+Arrays.deepToString(arr));
        
        switch (route){
            case 1: 
                moveRight(arr,position);
                break;
            case 2: 
                moveLeft(arr,position);
                break;
            case 3: 
                moveUp(arr,position);
                break;
            case 4: 
                moveDown(arr,position);
                break;
        }
        
        System.out.println("После сдвига:\n"+Arrays.deepToString(arr));
    }
    
    	public static void moveRight(int[][] array, int positions) {
	    int size = array[0].length;
            for (int n = 0; n <array.length; n++) {
                for (int i = 0; i < positions; i++) {
                    int temp = array[n][size - 1];
                    for (int j = size - 1; j > 0; j--) {
                        array[n][j] = array[n][j-1];
                    }
                    array[n][0] = temp;
                }
            }
	}
	public static void moveLeft(int[][] array, int positions) {
	    int size = array[0].length;
            for (int n = 0; n < array.length; n++) {
                for (int i = size; i > positions; i--) {
                    int temp = array[n][size-1];
                    for (int j = size-1; j > 0; j--) {
                        array[n][j] = array[n][j-1];
                    }
                    array[n][0] = temp;
                }
            }
        }
        
        public static void moveUp(int[][] array, int positions) {
	    int size = array.length;
            for (int n = 0; n < array[0].length; n++) {
                for (int i = size; i > positions; i--) {
                    int temp = array[size-1][n];
                    for (int j = size-1; j > 0; j--) {
                        array[j][n] = array[j-1][n];
                    }
                    array[0][n] = temp;
                }
            }
        }
        public static void moveDown(int[][] array, int positions) {
	    int size = array.length;
            for (int n = 0; n <array[0].length; n++) {
                for (int i = 0; i < positions; i++) {
                    int temp = array[size - 1][n];
                    for (int j = size - 1; j > 0; j--) {
                        array[j][n] = array[j-1][n];
                    }
                    array[0][n] = temp;
                }
            }
	}
    
}
