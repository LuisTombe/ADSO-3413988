/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject9;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class PlanoCartesiano8 {

    public static void main(String[] args) {
        double AA,AB,OA,OB;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Porfavor digite la abscisa de A");
        AA=teclado.nextDouble();
        
        System.out.println("Porfavor digite la abscisa de B");
        AB=teclado.nextDouble();
        
        System.out.println("Porfavor digite la ordenada de A");
        OA=teclado.nextDouble();
        
        System.out.println("Porfavor digite la ordenada de B");
        OB=teclado.nextDouble();
        
        double D;
        
        D= Math.sqrt(Math.pow(AB-AA,2)+Math.pow(OB-OA,2));
        
        System.out.println("La distancia entre y A y B da como resultado"+D);
    }
}
