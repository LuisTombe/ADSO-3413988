/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int [][] Matriz = new int [5][5];
        int NR=0,NMR=0,CR=0;
        Random random = new Random ();
        Scanner teclado = new Scanner (System.in);
        System.out.println("Busqueda del numero mas repetido");
        System.out.println("SU MATRIZ");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.println("Digite el numero en la posición "+(i)+" y "+(j));
                Matriz[i][j]=teclado.nextInt();
                
            }  
        }
        for (int N = 0; N < 25;N++) {
            int k=0;
            for (int i = 0; i < Matriz.length; i++) {
                for (int j = 0; j < Matriz[i].length; j++) {
                    
                    if (Matriz[i][j]==N) {
                        k++;
                        
                    }
                }
            }
            
            if (k>NR) {
                NR=k;
                NMR=N;
                
            }
            
        }
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-12s", Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
        System.out.println("El numero que mas se repite en la matriz es "+NMR);
        System.out.println("La cantidad de veces que ese numero se repite es "+NR);

    }
}
