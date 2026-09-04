/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio30;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio30 {

    public static void main(String[] args) {
        System.out.println("Simulacion Propagacion de Virus");

        Random random = new Random();

        int[][] Poblacion = new int[5][5];

        int infectados = 0;

        for (int i = 0; i < Poblacion.length; i++) {
            for (int j = 0; j < Poblacion[i].length; j++) {

                Poblacion[i][j] = 0;

            }
        }

        Poblacion[2][2] = 1;

        for (int ciclo = 1; ciclo <= 3; ciclo++) {

            for (int i = 0; i < Poblacion.length; i++) {
                for (int j = 0; j < Poblacion[i].length; j++) {

                    if (Poblacion[i][j] == 1) {

                        if (i > 0)
                            Poblacion[i - 1][j] = 1;

                        if (i < Poblacion.length - 1)
                            Poblacion[i + 1][j] = 1;

                        if (j > 0)
                            Poblacion[i][j - 1] = 1;

                        if (j < Poblacion[i].length - 1)
                            Poblacion[i][j + 1] = 1;
                    }
                }
            }

            System.out.println("CICLO " + ciclo);

            for (int i = 0; i < Poblacion.length; i++) {
                for (int j = 0; j < Poblacion[i].length; j++) {

                    System.out.printf("%-3s", Poblacion[i][j] + " ");
                }
                System.out.println();
            }
        }

        for (int i = 0; i < Poblacion.length; i++) {
            for (int j = 0; j < Poblacion[i].length; j++) {

                if (Poblacion[i][j] == 1) {

                    infectados++;

                }
            }
        }

        double porcentaje =
                (double) infectados * 100 / (Poblacion.length * Poblacion[0].length);

        System.out.println("Porcentaje infectado: " + porcentaje + "%");
    }
}
