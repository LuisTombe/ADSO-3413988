/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject19;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class NumeroAVocal16 {

    public static void main(String[] args) {

Scanner teclado=new Scanner (System.in);
        
        int NE;
        System.out.println("Convertir numero entero a vocales");
        System.out.println("Ingrese un numero entero del 1 al 5");
        
        NE=teclado.nextInt();
        
        switch (NE){
            
            case 1->
               System.out.println("V=A");
            case 2->
               System.out.println("V=E");
            case 3->
               System.out.println("V=I");
            case 4->
               System.out.println("V=O");
            case 5->
               System.out.println("V=U");
            
            default -> System.out.println("Número fuera de rango");
        }}}
