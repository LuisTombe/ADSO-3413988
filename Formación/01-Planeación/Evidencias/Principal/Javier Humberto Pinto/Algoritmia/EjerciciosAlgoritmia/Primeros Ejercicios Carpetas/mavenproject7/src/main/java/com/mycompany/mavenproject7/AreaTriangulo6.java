/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject7;

import java.util.Scanner;
        

/**
 *
 * @author ~ Shino ~
 */
public class AreaTriangulo6 {

    public static void main(String[] args) {
        
        double LA,LB,LC,LS,AT;
        Scanner teclado=new Scanner (System.in);
        
        System.out.println("Porfavor digite el valor del lado A del triangulo"); 
        LA=teclado.nextDouble();
        System.out.println("Porfavor digite el valor del lado B del triangulo");
        LB=teclado.nextDouble();
        System.out.println("Porfavor digite el valor del lado C del triangulo");
        LC=teclado.nextDouble();
        
        LS= (LA+LB+LC)/2;
        
        System.out.println("La longitud del semiperimetro equivale a "+LA+" mas "+LB+" mas "+LC+" y todo dividido entre 2 que da como resultado "+LS);
        
        AT = Math.sqrt(LS*(LS-LA)*(LS-LB)*(LS-LC));
        
        System.out.println("El area del triangulo equivale a "+AT);
        

    }
}
