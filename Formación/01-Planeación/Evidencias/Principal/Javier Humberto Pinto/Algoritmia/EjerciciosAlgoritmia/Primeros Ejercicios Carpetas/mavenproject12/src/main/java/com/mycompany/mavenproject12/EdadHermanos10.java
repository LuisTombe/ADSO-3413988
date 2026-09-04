/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject12;

import java.util.Scanner;
        
/**
 *
 * @author ~ Shino ~
 */
public class EdadHermanos10 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        
        int E1,E2,DE;
        
        System.out.println("Porfavor ingresa la edad del primer hermano");
        E1=teclado.nextInt();
        System.out.println("Porfavor ingresa la edad del segundo hermano");
        E2=teclado.nextInt();
        DE=E1-E2;
        
        if (E1>E2){
            System.out.println("Recordar que DE= Diferencía de edad. E1= Edad del primer hermano y E2= Edad del segundo hermano");
            System.out.println("El primer hermano es mayor porque DE=E1-E2 da como resultado una diferencía de "+DE+" respecto a la edad del segundo hermano");}
            else
        {System.out.println("Recordar que DE= Diferencía de edad. E1= Edad del primer hermano y E2= Edad del segundo hermano");
            System.out.println("El segundo hermano es el mayor porque DE=E2-E2 da como resultado una diferencia de "+DE+" respecto a la edad del primer hermano");{
        }
        }
    }
}