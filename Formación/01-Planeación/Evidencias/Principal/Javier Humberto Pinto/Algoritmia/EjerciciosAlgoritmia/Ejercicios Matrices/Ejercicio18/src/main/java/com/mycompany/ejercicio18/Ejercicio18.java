/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("Matriz Filas Duplicadas");
        System.out.println("------------------------------------------------------");
        
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        int f=0,c=0;
        
        System.out.println("Ingrese la cantidad de [Filas] y [Columnas] de su Matriz");
        System.out.println("Para filas:");
        f=teclado.nextInt();
        System.out.println("Para columnas");
        c=teclado.nextInt();
        
        int [][] Matriz = new int [f][c];
        
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.println("Digite los datos de la fila "+(i+1));
                Matriz[i][j]=teclado.nextInt();
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("MATRIZ #1");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
     
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
            
        }
        
        int filasduplicadas=0;
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int k = i+1; k < Matriz.length; k++) {
                
                boolean iguales = true;
                for (int j = 0; j < Matriz[i].length; j++) {
                    
                    if (Matriz[i][j]!=Matriz[k][j]) {
                        
                        iguales=false;
                    }
                }
                
                if (iguales) {
                    
                    System.out.println("fila " +i+ " y Fila " +k+ " son iguales ");
                    
                    filasduplicadas++;
                }
            }
        }
        System.out.println("------------------------------------------------------");
        System.out.println("La cantidad de filas duplicadas son : "+filasduplicadas);
        System.out.println("------------------------------------------------------");
    }
}
