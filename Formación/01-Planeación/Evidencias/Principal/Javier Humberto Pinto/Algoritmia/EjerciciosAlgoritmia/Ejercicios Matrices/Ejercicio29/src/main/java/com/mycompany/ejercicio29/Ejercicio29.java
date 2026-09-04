/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio29;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        System.out.println("Compresion de Matriz");

        Random random = new Random();

        int[][] Matriz = new int[5][5];

        int original = 25;
        int comprimido = 0;

        System.out.println("MATRIZ");

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                Matriz[i][j] = random.nextInt(3);

                System.out.printf("%-5s", Matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("COMPRESION");

        for (int i = 0; i < Matriz.length; i++) {

            int contador = 1;

            for (int j = 1; j < Matriz[i].length; j++) {

                if (Matriz[i][j]== Matriz[i][j - 1]) {

                    contador++;

                } else {

                    System.out.print(Matriz[i][j - 1]+ "(" + contador + ") ");

                    comprimido++;

                    contador = 1;
                }
            }

            System.out.print(Matriz[i][Matriz[i].length - 1]+ "(" + contador + ") ");

            comprimido++;

            System.out.println();
        }

        double reduccion =
                100 - ((double) comprimido * 100 / original);

        System.out.println("Reduccion = "+ reduccion + "%");
    }
}
