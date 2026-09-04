/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio28;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        System.out.println("Sistema de Produccion Industrial");

        Random random = new Random();

        int[][] Produccion = new int[5][7];

        int mejorMaquina = 0;
        int mayorProduccion = 0;

        System.out.println("PRODUCCION");

        for (int i = 0; i < Produccion.length; i++) {
            for (int j = 0; j < Produccion[i].length; j++) {

                Produccion[i][j] = random.nextInt(100);

                System.out.printf("%-5s", Produccion[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < Produccion.length; i++) {

            int suma = 0;

            for (int j = 0; j < Produccion[i].length; j++) {

                suma += Produccion[i][j];
            }

            double promedio =
                    (double) suma / Produccion[i].length;

            System.out.println("Maquina " + (i + 1) + " promedio = " + promedio);

            if (suma > mayorProduccion) {

                mayorProduccion = suma;
                mejorMaquina = i + 1;

            }

            if (promedio < 30) {

                System.out.println("Maquina " + (i + 1) + " bajo rendimiento");
            }
        }

        System.out.println("Maquina mas productiva: " + mejorMaquina);

        for (int j = 0; j < Produccion[0].length; j++) {

            int suma = 0;

            for (int i = 0; i < Produccion.length; i++) {

                suma += Produccion[i][j];

            }

            if (suma < 200) {

                System.out.println("Dia critico: " + (j + 1));
            }
        }
    }
}