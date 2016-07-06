/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes.tasktwo;

/**
 *
 * @author Дениска
 */
public class ExerciseOne {
    public static void main(String[] args) {
        int sum=0;
        int sum2=0;
        int sum7=0;
        int sum3=0;
        int sum5=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0||i%3==0||i%5==0||i%7==0) {
                System.out.print(i+" ");
                sum+=i;
            }
            if (i%2==0) {
                sum2+=i;
            }
            if (i%7==0) {
                sum7+=i;
            }
            if (i%3==0) {
                sum3+=i;
            }
            if (i%5==0) {
                sum5+=i;
            }
        }
        System.out.println("\nSumma: "+sum);
        System.out.println("Raznost sum2-sum7:"+sum2+"-"+sum7+"="+(sum2-sum7));
        System.out.println("Отношение sum5/sum3:"+sum5+"/"+sum3+"="+(sum5/sum3));
    }
    
}
