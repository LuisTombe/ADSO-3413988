/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio36;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio36 {

    public static void main(String[] args) {

        System.out.println("Deteccion de Islas en Matriz");

        Random random = new Random();

        int[][] Matriz = new int[10][10];

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                Matriz[i][j] = random.nextInt(2);

            }
        }

        System.out.println();
        System.out.println("MAPA");

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                System.out.printf("%-4s", Matriz[i][j]);

            }
            System.out.println();
        }

        int islas = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                if (Matriz[i][j]==1) {

                    boolean arriba=false;
                    boolean izquierda=false;

                    if (i > 0 && Matriz[i-1][j]==1) {
                        arriba=true;
                    }
                    if (j > 0 && Matriz[i][j-1]==1) {
                        izquierda=true;
                    }
                    if (!arriba && !izquierda) {
                        
                        islas++;
                        System.out.println("Isla encontrada en fila "+i+" columna "+j);

                    }
                }
            }
        }
        System.out.println();
        System.out.println("Cantidad de islas: " + islas);
    }
}
