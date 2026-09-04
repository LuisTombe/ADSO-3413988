/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        
        int [][] Matriz = new int [5][5];
        
        System.out.println("..................................");
        System.out.println("Ruta Más Corta en Matriz");
        System.out.println("..................................");
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                Matriz[i][j]=random.nextInt(2);
                
                System.out.printf("%-4s", +Matriz[i][j]+ " ");
                
            }
            System.out.println();
        }
        
        Matriz[0][0] = 0;
        Matriz[4][4] = 0;

        int fila = 0;
        int columna = 0;
        int pasos = 0;

        while (fila != 4 || columna != 4) {

            Matriz[fila][columna] = 2;

            if (columna < 4 && Matriz[fila][columna + 1] == 0) {

                columna++;

            } else if (fila < 4 && Matriz[fila + 1][columna] == 0) {

                fila++;

            } else {

                break;
            }

            pasos++;
        }
        Matriz[0][0] = 4;
        Matriz[4][4] = 3;
        
        System.out.println("..................................");
        System.out.println("RUTA");
        System.out.println("..................................");

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                switch (Matriz[i][j]) {
                    
                    case 4:
                        System.out.printf("%-3s", "S ");
                        break;
                        

                    case 0:
                        System.out.printf("%-3s", ". ");
                        break;

                    case 1:
                        System.out.printf("%-3s", "# ");
                        break;

                    case 2:
                        System.out.printf("%-3s", "X ");
                        break;

                    case 3:
                        System.out.printf("%-3s", "F ");
                        break;
                }
            }
            System.out.println();
        }

        System.out.println("Pasos: " + pasos);
    }
}
