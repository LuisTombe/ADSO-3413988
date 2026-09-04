/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio21 {

    public static void main(String[] args) {

        System.out.println("ANALISIS ESTADISTICO DE MATRIZ");

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el tamaño de la matriz:");
        int n = teclado.nextInt();

        int[][] Matriz = new int[n][n];

        int suma = 0;
        int max;
        int min;

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                Matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("--------------------------");
        System.out.println("MATRIZ");
        System.out.println("--------------------------");

        max = Matriz[0][0];
        min = Matriz[0][0];

        int[] Vector = new int[n * n];
        int pos = 0;

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {

                System.out.printf("%-5s", Matriz[i][j] + " ");

                suma += Matriz[i][j];

                if (Matriz[i][j] > max) {
                    max = Matriz[i][j];
                }

                if (Matriz[i][j] < min) {
                    min = Matriz[i][j];
                }

                Vector[pos] = Matriz[i][j];
                pos++;
            }
            System.out.println();
        }

        double promedio = (double) suma / (n * n);

        int moda = 0;
        int nmr = 0;

        for (int N = 0; N < 10; N++) {

            int contador = 0;

            for (int i = 0; i < Matriz.length; i++) {
                for (int j = 0; j < Matriz[i].length; j++) {

                    if (Matriz[i][j] == N) {
                        contador++;
                    }
                }
            }

            if (contador > nmr) {

                nmr = contador;
                moda = N;
            }
        }

        for (int i = 0; i < Vector.length - 1; i++) {
            for (int j = 0; j < Vector.length - 1; j++) {

                if (Vector[j] > Vector[j + 1]) {

                    int aux = Vector[j];
                    Vector[j] = Vector[j + 1];
                    Vector[j + 1] = aux;
                }
            }
        }

        double mediana;

        if (Vector.length % 2 == 0) {

            mediana =
                    (Vector[Vector.length / 2]
                    + Vector[(Vector.length / 2) - 1]) / 2.0;

        } else {

            mediana = Vector[Vector.length / 2];
        }

        System.out.println("--------------------------");
        System.out.println("RESULTADOS");
        System.out.println("--------------------------");

        System.out.println("Media = " + promedio);
        System.out.println("Moda = " + moda + " (" + nmr + " veces)");
        System.out.println("Mediana = " + mediana);
        System.out.println("Maximo = " + max);
        System.out.println("Minimo = " + min);
    }
}

