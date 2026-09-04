/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio27;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio27 {

    public static void main(String[] args) {
        System.out.println("Matriz Patron Serpiente");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese tamaño:");

        int n = teclado.nextInt();

        int[][] Matriz = new int[n][n];

        int num = 1;

        for (int i = 0; i < Matriz.length; i++) {

            if (i % 2 == 0) {

                for (int j = 0; j < Matriz[i].length; j++) {

                    Matriz[i][j] = num++;

                }

            } else {

                for (int j = Matriz[i].length - 1; j >= 0; j--) {

                    Matriz[i][j] = num++;

                }
            }
        }

        System.out.println("MATRIZ SERPIENTE");

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                System.out.printf("%-5s", Matriz[i][j] + " ");

            }
            System.out.println();
        }
    }
}
