/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        int n=0;
        System.out.println("Sistema para Matrices Simetricas");
        System.out.println("Digite el numero de filas y columnas");
        n=teclado.nextInt();
        
        int[][]Matriz = new int [n][n];
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.println("Digite un numero en la fila "+(i)+" en la columna "+(j));
                Matriz[i][j]=teclado.nextInt();
                
            }
            
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-5s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();            
        }
        boolean simetrico=true;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (Matriz[i][j] != Matriz[j][i]) {
                    simetrico=false;
                }
            }
        }
        if (simetrico) {
            System.out.println("Su Matriz es Simetrica");
            
        }else{
            System.out.println("Su Matriz es Asimetrica");
        }
    }
}
