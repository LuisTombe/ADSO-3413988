/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject20;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class CDU17coma1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int NE,C,D,U,Q1,Q2,R1,R2;
        System.out.println("Centenas (C) Decenas(D) y Unidades(U)");
        System.out.println("Ingrese un numero entero de maximo 3 digitos");
        
        NE=teclado.nextInt();
        
        Q1= (NE/100);
        R1= (NE%100);
        Q2= (R1/10);
        R2= (R1%10);
        C= Q1;
        D= Q2;
        U= R2;
        
        System.out.println("Numero de Centenas es igual a "+C);
        
        System.out.println("Numero de Decenas es igual a "+D);
        
        System.out.println("Numero de Unidades es igual a "+U);
        

    }
}
