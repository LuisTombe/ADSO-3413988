/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio31;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio31 {

     public static void main(String[] args) {

        System.out.println("Simulación Trafico Inteligente");

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        boolean semaforoVerde = false;

        int[][] Matriz = new int[6][6];

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                int numero = random.nextInt(10);
                if (numero <= 4) {
                    Matriz[i][j]=0;
                } else if (numero <= 7) {
                    Matriz[i][j]=1;
                } else if (numero==8) {
                    Matriz[i][j]=2;
                } else {
                    Matriz[i][j]=3;
                }
            }
        }

        while(true){
            
            int op=0;
            System.out.println("MENU");
            System.out.println("1.Ejecutar ciclo");
            System.out.println("2.Apagar Sistema");
            op = teclado.nextInt();

            switch(op){

                case 1:

                    semaforoVerde = !semaforoVerde;

                    if (semaforoVerde){
                        System.out.println("Semaforo: VERDE");
                    }else{
                        System.out.println("Semaforo: ROJO");
                    }

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = Matriz[i].length - 1; j >= 0; j--) {

                            if (Matriz[i][j]==1) {

                                if (j + 1 < Matriz[i].length) {
                                    if (Matriz[i][j+1]==0) {

                                        Matriz[i][j]=0;
                                        Matriz[i][j+1]=1;
                                        
                                    }

                                    else if (Matriz[i][j+1]==2) {

                                        if (semaforoVerde) {

                                            if (j+2 < Matriz[i].length) {

                                                if (Matriz[i][j+2]==0) {

                                                    Matriz[i][j]=0;
                                                    Matriz[i][j+2]=1;

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = 0; j < Matriz[i].length; j++) {

                            System.out.printf("%-4s", Matriz[i][j]);

                        }
                        System.out.println();
                    }

                    int congestion = 0;

                    for (int i = 0; i < Matriz.length; i++) {
                        for (int j = 0; j < Matriz[i].length; j++) {

                            if (Matriz[i][j]==1) {

                                congestion++;

                            }
                        }
                    }

                    System.out.println();
                    System.out.println("Vehiculos en la ciudad: " + congestion);

                    break;

                case 2:

                    System.out.println("Apagando sistema...");
                    return;

            }
        }
    }
}
