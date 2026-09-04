/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject22;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class ParOImpar18 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int NE,Q,R;
        System.out.println("Algoritmo para determinar si un numero es par o impar");
        System.out.println("Ingrese un numero entero");
        
        NE=teclado.nextInt();
        Q= NE/2;
        R=NE-(Q*2);
        
       
        if (R==0){
            System.out.println("Es par");
            
        }else
            System.out.println("Es impar");{
        
        }   
    }
}

