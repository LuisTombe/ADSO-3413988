/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizespejohorizontalyvertical;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class MatrizEspejoHorizontalyVertical {

    public static void main(String[] args) {        
        
        int [][]Matriz = new int [5][5];
        Scanner teclado =new Scanner (System.in);
        int Opción;
        Random random =new Random();
                            
        System.out.println("Matriz Espejo Horizontal y Vertical");

        System.out.println("-Su Matriz Normal-");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                
                Matriz[i][j]=random.nextInt(10);
                System.out.print(Matriz[i][j]+ " ");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
        do {
            
            System.out.println("Porfavor ingrese escoja la opción de espejo que quiere ver de la matriz");
            System.out.println("Para ver la matriz normal (1)");
            System.out.println("Para espejo horizontal ingrese (2)");
            System.out.println("Para espejo vertical ingrese (3)");
            System.out.println("Para salir (4)");
            Opción=teclado.nextInt();
            
            if (Opción==1) {
                System.out.println("-Su Matriz Normal:");
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz.length; j++) {
                        System.out.print(Matriz[i][j]+ " ");
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                }
            }
            if (Opción==2) {
                System.out.println("-Su Matriz Invertida Horizontal:");
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = Matriz[i].length -1; j >= 0; j--) {
                        System.out.print(Matriz [i][j]+ " ");
                        System.out.print(" ");
                    }
                    System.out.println(" "); 
                }
            }
            if (Opción==3) {
                System.out.println("-Su Matriz Invertida Vertical:");
                for (int i = Matriz.length -1; i >= 0; i--) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        System.out.print(Matriz [i][j]+ " ");
                        System.out.print(" ");
                    }
                    System.out.println(" ");
                }
            }
        }while (Opción!=4);
        
        System.out.println("SESION TERMINADA");

    }
}


