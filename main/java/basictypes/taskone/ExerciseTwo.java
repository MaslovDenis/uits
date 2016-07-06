/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basictypes.taskone;
import java.lang.Math.*;
/**
 *
 * @author Дениска
 */
public class ExerciseTwo {
    public static void main(String[] args) {
        double pi=3.14;
        int r=6;
        int R=8;
        int a=10,b=7,c=13;
                
        double dlinaOkr;
        double plOkr;
        double plKol;
        double perTR, plTr, perPryam, plPryam;
        
        dlinaOkr=2*pi*r;
        plOkr=pi*r*r;
        plKol=pi*((R*R)-(r*r));
        perTR=1/2*(a+b+c);
        plTr=(a+b+c)/4*R; 
        perPryam=Math.sqrt(a*a+b*b);
        plPryam=a*b;
    }
    
}
