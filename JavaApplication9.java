/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner d=new Scanner (System.in);
        int a=d.nextInt();
        int b=d.nextInt();
        int c=d.nextInt();
        int h=0;
        int t,k;
        h=(b*b)-4*(a*c);
        if(h>0)
        {
           t=(int) ((-b + sqrt(h))/2*a);
           k=(int) ((-b - sqrt(h))/2*a);
           System.out.print(t);
           System.out.print(k);
           
        }
        else if(h==0)
        {
            t=-b/2*a;
            System.out.print(t);
        }
        else
            System.out.print("not found");
        
    }
    
}
