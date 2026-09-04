/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject21;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class DecenasYUnidades17 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int NE,D,U,Q1,R1;
        System.out.println("Decenas(D) y Unidades(U)");
        System.out.println("Ingrese un numero entero de maximo 2 digitos");
        
        NE=teclado.nextInt();
        
        Q1= (NE/10);
        R1= NE-(Q1*10);
        D= Q1;
        U= R1;
        
        System.out.println("Numero de Decenas es igual a "+D);
        
        System.out.println("Numero de Unidades es igual a "+U);
    }
}
