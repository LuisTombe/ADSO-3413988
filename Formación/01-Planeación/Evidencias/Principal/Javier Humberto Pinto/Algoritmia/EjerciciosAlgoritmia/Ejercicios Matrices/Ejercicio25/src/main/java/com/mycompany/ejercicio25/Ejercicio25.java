/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio25;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio25 {

    public static void main(String[] args) {

        System.out.println("CLASIFICACION DE TEMPERATURAS");

        Random random = new Random();

        int[][] Temperaturas = new int[5][7];

        int max = 0;
        int min = 100;

        for (int i = 0; i < Temperaturas.length; i++) {
            for (int j = 0; j < Temperaturas[i].length; j++) {

                Temperaturas[i][j] =
                        random.nextInt(26) + 15;

                if (Temperaturas[i][j] > max) {
                    max = Temperaturas[i][j];
                }

                if (Temperaturas[i][j] < min) {
                    min = Temperaturas[i][j];
                }
            }
        }

        System.out.println("-----------------------");
        System.out.println("TEMPERATURAS");
        System.out.println("-----------------------");

        for (int i = 0; i < Temperaturas.length; i++) {
            for (int j = 0; j < Temperaturas[i].length; j++) {

                System.out.printf("%-5s", Temperaturas[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < Temperaturas.length; i++) {

            int suma = 0;

            for (int j = 0; j < Temperaturas[i].length; j++) {

                suma += Temperaturas[i][j];

            }

            double promedio =
                    (double) suma / Temperaturas[i].length;

            System.out.println("Promedio ciudad " + (i + 1)+ " = " + promedio);
        }

        System.out.println();
        System.out.println("Temperatura maxima = " + max);
        System.out.println("Temperatura minima = " + min);

        System.out.println();
        System.out.println("ALERTAS");

        for (int i = 0; i < Temperaturas.length; i++) {
            for (int j = 0; j < Temperaturas[i].length; j++) {

                if (Temperaturas[i][j] >= 35) {

                    System.out.println("Calor extremo en Ciudad " + (i + 1)+ " Dia " + (j + 1));

                }

                if (Temperaturas[i][j] <= 18) {

                    System.out.println("Frio extremo en Ciudad " + (i + 1)+ " Dia " + (j + 1));

                }
            }
        }
    }
}
