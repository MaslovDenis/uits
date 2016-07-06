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
public class ExerciseThree {
    public static void main(String[] args) {
        double pi=3.14;
        int r=6;
        int R=8;
        int H=12;
        int a=10,b=7,c=13;       
        
        double obCil,obPoloCil,plBokCil,obShar,plShar,obPara,plPara,obTetra,plTetra;
        
        obCil=pi*r*r*H;
        obPoloCil=pi*H*(R*R-r*r);
        plBokCil=2*pi*r*H;
        obShar=4*pi*Math.pow(r, 3)/3;
        plShar=4*pi*R*R;
        obPara=a*b*c;
        plPara=2*(a*b+b*c+a*c);
        obTetra=Math.pow(a, 3)*Math.sqrt(2)/12;
        
    }
}
