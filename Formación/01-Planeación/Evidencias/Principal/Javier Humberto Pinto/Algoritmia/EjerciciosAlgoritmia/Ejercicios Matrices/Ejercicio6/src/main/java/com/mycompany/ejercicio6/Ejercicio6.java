/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        
        int f=0,c=0;
        System.out.println("MATRIZ TRANSPUESTA");
        System.out.println("Ingrese la cantidad de filas");
        f=teclado.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        c=teclado.nextInt();
        
        int [][]Matriz = new int [f][c];
        int [][]Transpuesta = new int [c][f];
        
        System.out.println("MATRIZ NORMAL");
        System.out.println("-------------");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                
                Matriz[i][j]=random.nextInt(10);
                
                System.out.print(Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
        
        System.out.println("MATRIZ TRANSPUESTA");
        System.out.println("-------------");            
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    
                    Transpuesta[j][i]=Matriz[i][j];
                }
            }
            
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    
                    System.out.print(Transpuesta[i][j]+ " ");
                    
                }
                System.out.println();
            
        }
    }
}
