/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.epidemiaej;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class EpidemiaEJ {

    public static void main(String[] args) {

        System.out.println("SIMULACIÓN DE EPIDEMIA AVANZADA");

        /*
        ESTADOS:

        0 = VACÍO
        1 = SANO
        2 = INFECTADO
        3 = RECUPERADO
        4 = FALLECIDO
        5 = VACUNADO
        */

        int[][] Ciudad = new int[10][10];

        Random random = new Random();

        Scanner teclado = new Scanner(System.in);

        int filaInfectada, columnaInfectada;

        // =========================================
        // GENERAR POBLACIÓN
        // =========================================

        for (int i = 0; i < Ciudad.length; i++) {

            for (int j = 0; j < Ciudad[i].length; j++) {

                // GENERAR PERSONAS
                Ciudad[i][j] = random.nextInt(2);

                // ALGUNOS VACUNADOS
                if (Ciudad[i][j] == 1 && random.nextInt(100) < 15) {

                    Ciudad[i][j] = 5;
                }
            }
        }

        // =========================================
        // MOSTRAR TABLERO INICIAL
        // =========================================

        System.out.println("\nTABLERO INICIAL:\n");

        mostrarMatriz(Ciudad);

        // =========================================
        // INFECTAR PERSONA INICIAL
        // =========================================

        System.out.println("\nDigite la fila inicial infectada:");
        filaInfectada = teclado.nextInt();

        System.out.println("Digite la columna inicial infectada:");
        columnaInfectada = teclado.nextInt();

        // VALIDACIÓN
        if (filaInfectada < 0 || filaInfectada > 9
                || columnaInfectada < 0 || columnaInfectada > 9) {

            System.out.println("Posición inválida");
            return;
        }

        // INFECTAR SOLO SI ES SANO
        if (Ciudad[filaInfectada][columnaInfectada] == 1) {

            Ciudad[filaInfectada][columnaInfectada] = 2;

        } else {

            System.out.println("No se puede infectar esa posición");
            return;
        }

        // =========================================
        // CICLOS EPIDEMIOLÓGICOS
        // =========================================

        int ciclo = 0;

        while (true) {

            ciclo++;

            System.out.println("\n===========================");
            System.out.println("CICLO EPIDEMIOLÓGICO " + ciclo);
            System.out.println("===========================\n");

            int[][] Auxiliar = new int[10][10];

            // COPIAR MATRIZ
            for (int i = 0; i < Ciudad.length; i++) {

                for (int j = 0; j < Ciudad[i].length; j++) {

                    Auxiliar[i][j] = Ciudad[i][j];
                }
            }

            // =========================================
            // PROPAGACIÓN
            // =========================================

            for (int i = 0; i < Ciudad.length; i++) {

                for (int j = 0; j < Ciudad[i].length; j++) {

                    // PERSONA INFECTADA
                    if (Ciudad[i][j] == 2) {

                        // ARRIBA
                        if (i > 0 && Ciudad[i - 1][j] == 1) {

                            if (random.nextInt(100) < 50) {

                                Auxiliar[i - 1][j] = 2;
                            }
                        }

                        // ABAJO
                        if (i < 9 && Ciudad[i + 1][j] == 1) {

                            if (random.nextInt(100) < 50) {

                                Auxiliar[i + 1][j] = 2;
                            }
                        }

                        // IZQUIERDA
                        if (j > 0 && Ciudad[i][j - 1] == 1) {

                            if (random.nextInt(100) < 50) {

                                Auxiliar[i][j - 1] = 2;
                            }
                        }

                        // DERECHA
                        if (j < 9 && Ciudad[i][j + 1] == 1) {

                            if (random.nextInt(100) < 50) {

                                Auxiliar[i][j + 1] = 2;
                            }
                        }

                        // =========================================
                        // DESTINO DEL INFECTADO
                        // =========================================

                        int destino = random.nextInt(100);

                        // RECUPERACIÓN
                        if (destino < 50) {

                            Auxiliar[i][j] = 3;
                        }

                        // FALLECIMIENTO
                        else if (destino < 70) {

                            Auxiliar[i][j] = 4;
                        }

                        // SIGUE INFECTADO
                        else {

                            Auxiliar[i][j] = 2;
                        }
                    }
                }
            }

            // =========================================
            // ACTUALIZAR MATRIZ
            // =========================================

            for (int i = 0; i < Ciudad.length; i++) {

                for (int j = 0; j < Ciudad[i].length; j++) {

                    Ciudad[i][j] = Auxiliar[i][j];
                }
            }

            // =========================================
            // MOSTRAR TABLERO
            // =========================================

            mostrarMatriz(Ciudad);

            // =========================================
            // ESTADÍSTICAS
            // =========================================

            int sanos = 0;
            int infectados = 0;
            int recuperados = 0;
            int fallecidos = 0;
            int vacunados = 0;

            for (int i = 0; i < Ciudad.length; i++) {

                for (int j = 0; j < Ciudad[i].length; j++) {

                    switch (Ciudad[i][j]) {

                        case 1:

                            sanos++;
                            break;

                        case 2:

                            infectados++;
                            break;

                        case 3:

                            recuperados++;
                            break;

                        case 4:

                            fallecidos++;
                            break;

                        case 5:

                            vacunados++;
                            break;
                    }
                }
            }

            int totalPoblacion =
                    sanos + infectados + recuperados
                    + fallecidos + vacunados;

            double tasaRecuperacion =
                    (double) recuperados / totalPoblacion * 100;

            double tasaMortalidad =
                    (double) fallecidos / totalPoblacion * 100;

            System.out.println("\nESTADÍSTICAS:");

            System.out.println("Sanos: " + sanos);

            System.out.println("Infectados: " + infectados);

            System.out.println("Recuperados: " + recuperados);

            System.out.println("Fallecidos: " + fallecidos);

            System.out.println("Vacunados: " + vacunados);

            System.out.println("Tasa recuperación: "
                    + tasaRecuperacion + "%");

            System.out.println("Tasa mortalidad: "
                    + tasaMortalidad + "%");

            // =========================================
            // FINALIZAR SIMULACIÓN
            // =========================================

            if (infectados == 0) {

                System.out.println("\nLA EPIDEMIA HA TERMINADO");

                break;
            }

            // PAUSA VISUAL
            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }

    // =========================================
    // MÉTODO PARA MOSTRAR MATRIZ
    // =========================================

    public static void mostrarMatriz(int[][] Ciudad) {

        for (int i = 0; i < Ciudad.length; i++) {

            for (int j = 0; j < Ciudad[i].length; j++) {

                System.out.print(Ciudad[i][j] + " ");
            }

            System.out.println();
        }
    }
}
