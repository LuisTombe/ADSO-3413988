/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject32;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Mavenproject32 {

    public static void main(String[] args) {
        int N1,N2,R;
        char OP;
        
            
        
        Scanner teclado=new Scanner (System.in);
        System.out.println("Escribir primer número (N1)");
        N1=teclado.nextInt();
        System.out.println("Ingrese el operador (+,-,*,^)");
        OP= teclado.next().charAt(0);
        System.out.println("Escribir segundo número (N2)");
        N2=teclado.nextInt();
        
        
        switch (OP){
            default ->
                R=0;
            case ('+')->
                R=N1+N2;
            case ('-')->
                R=N1-N2;
            case ('*')->
                R=N1*N2;
            case ('^')->
                R=(int)(Math.pow(N1,N2));
        }
        { System.out.println("El resultado es de la operación fue de "+R); 
        
        }
    }
}
        
        
        

        
        


 