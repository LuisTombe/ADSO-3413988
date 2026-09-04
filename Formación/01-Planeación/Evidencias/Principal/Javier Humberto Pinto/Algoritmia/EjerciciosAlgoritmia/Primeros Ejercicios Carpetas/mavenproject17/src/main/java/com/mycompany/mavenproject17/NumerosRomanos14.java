/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject17;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class NumerosRomanos14 {

public static void main(String[] args) {

Scanner teclado=new Scanner (System.in);
        
        int Numero;
        System.out.println("Idenficar los siguientes datos. ER= Equivalente Romano");
        System.out.println("Porfavor ingresa un numero del 1 al 10");
        Numero=teclado.nextInt();
        
        switch (Numero){
            
            case 1->
               System.out.println("ER=I");
            case 2->
               System.out.println("ER=II");
            case 3->
               System.out.println("ER=III");
            case 4->
               System.out.println("ER=IV");
            case 5->
               System.out.println("ER=V");
            case 6->
               System.out.println("ER=VI");
            case 7->
               System.out.println("ER=VII");
            case 8->
               System.out.println("ER=VIII");
            case 9->
               System.out.println("ER=IX");
            case 10->
               System.out.println("ER=X");
            default -> System.out.println("Número fuera de rango");
        }
}
}
        