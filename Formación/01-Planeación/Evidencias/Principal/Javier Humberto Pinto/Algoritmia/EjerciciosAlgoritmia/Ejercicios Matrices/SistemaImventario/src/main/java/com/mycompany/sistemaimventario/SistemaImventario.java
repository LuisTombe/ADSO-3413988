package com.mycompany.sistemaimventario;

import java.util.Random;
import java.util.Scanner;

public class SistemaImventario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        String[][] inventario = new String[6][7];

        System.out.println("SISTEMA DE INVENTARIO");

        for (int c = 1; c < inventario[0].length; c++) {
            System.out.print("Ingrese la categoría " + c + ": ");
            inventario[0][c] = sc.next();
        }

        for (int f = 1; f < inventario.length; f++) {
            System.out.print("Ingrese el nombre del producto " + f + ": ");
            inventario[f][0] = sc.next();
        }

        for (int f = 1; f < inventario.length; f++) {
            for (int c = 1; c < inventario[f].length; c++) {
                inventario[f][c] = String.valueOf(rnd.nextInt(10));
            }
        }

        mostrarMatriz(inventario);

        while (true) {

            System.out.println("MENU");
            System.out.println("1. Registrar entrada");
            System.out.println("2. Registrar salida");
            System.out.println("3. Generar reporte");
            System.out.println("4. Salir");
            System.out.println("5. Mostrar matriz");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Fila: ");
                    int fila = sc.nextInt();
                    System.out.print("Columna: ");
                    int columna = sc.nextInt();

                    if (fila <= 0 || fila >= inventario.length || columna <= 0 || columna >= inventario[0].length) {
                        System.out.println("Posición inválida.");
                        break;
                    }

                    System.out.print("Cantidad de entrada: ");
                    int cantidad = sc.nextInt();

                    int stock = Integer.parseInt(inventario[fila][columna]);
                    stock += cantidad;
                    inventario[fila][columna] = String.valueOf(stock);

                    System.out.println("Entrada registrada correctamente.");
                    mostrarMatriz(inventario);
                }

                case 2 -> {
                    System.out.print("Fila: ");
                    int fila = sc.nextInt();
                    System.out.print("Columna: ");
                    int columna = sc.nextInt();

                    if (fila <= 0 || fila >= inventario.length || columna <= 0 || columna >= inventario[0].length) {
                        System.out.println("Posición inválida.");
                        break;
                    }

                    System.out.print("Cantidad de salida: ");
                    int salida = sc.nextInt();

                    int stock = Integer.parseInt(inventario[fila][columna]);

                    if (salida > stock) {
                        System.out.println("Inventario insuficiente.");
                        break;
                    }

                    stock -= salida;
                    inventario[fila][columna] = String.valueOf(stock);

                    System.out.println("Salida registrada.");
                    mostrarMatriz(inventario);
                }

                case 3 -> {
                    double mayorCat = 0, menorCat = Double.MAX_VALUE, totalGeneral = 0;
                    String nomMayor = "", nomMenor = "";

                    for (int c = 1; c < inventario[0].length; c++) {
                        double suma = 0;

                        for (int f = 1; f < inventario.length; f++) {
                            suma += Double.parseDouble(inventario[f][c]);
                        }

                        totalGeneral += suma;

                        if (suma > mayorCat) {
                            mayorCat = suma;
                            nomMayor = inventario[0][c];
                        }

                        if (suma < menorCat) {
                            menorCat = suma;
                            nomMenor = inventario[0][c];
                        }

                        System.out.println("Categoría " + inventario[0][c] + " -> Total: " + suma + " Promedio: " + (suma / 5));
                    }

                    double mayorProducto = 0;
                    String nombreProducto = "";

                    for (int f = 1; f < inventario.length; f++) {
                        double suma = 0;
                        for (int c = 1; c < inventario[f].length; c++) {
                            suma += Double.parseDouble(inventario[f][c]);
                        }
                        if (suma > mayorProducto) {
                            mayorProducto = suma;
                            nombreProducto = inventario[f][0];
                        }
                    }

                    int max = 0, filaMax = 0, colMax = 0;

                    System.out.println("Productos con stock menor a 10:");

                    for (int f = 1; f < inventario.length; f++) {
                        for (int c = 1; c < inventario[f].length; c++) {
                            int valor = Integer.parseInt(inventario[f][c]);

                            if (valor > max) {
                                max = valor;
                                filaMax = f;
                                colMax = c;
                            }

                            if (valor < 10) {
                                System.out.println(inventario[f][0] + " | " + inventario[0][c] + " | Stock: " + valor);
                            }
                        }
                    }

                    System.out.println("REPORTE");
                    System.out.println("Total inventario: " + totalGeneral);
                    System.out.println("Mayor categoría: " + nomMayor);
                    System.out.println("Menor categoría: " + nomMenor);
                    System.out.println("Producto con mayor cantidad acumulada: " + nombreProducto);
                    System.out.println("Mayor existencia individual: " + inventario[filaMax][0] + " -> " + max +
                            " [Fila " + filaMax + " Columna " + colMax + "]");
                }

                case 4 -> {
                    System.out.println("Sistema finalizado.");
                    return;
                }

                case 5 -> mostrarMatriz(inventario);

                default -> System.out.println("Opción inválida.");
            }
        }
    }

    public static void mostrarMatriz(String[][] datos) {
        System.out.println("MATRIZ");
        for (String[] fila : datos) {
            for (String valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
        System.out.println("");
    }
}