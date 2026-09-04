/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        System.out.println("Simulador de parqueadero");
        Random random = new Random();
        
        int [][] Matriz = new int [5][10];
        Scanner teclado = new Scanner (System.in);
        int op=0,f=0,c=0,ocupados=0;
        
        while (true){
        
        System.out.println("Ingrese la accion que quiere hacer en el Parqueadero");
        System.out.println("(1). Ingresar");
        System.out.println("(2). Sacar");
        System.out.println("(3). Mostrar");
        System.out.println("(4). Estadisticas");
        System.out.println("(5). Menu");
        op=teclado.nextInt();
        
        switch (op){
            
            case 1:
                System.out.println("INGRESO DEL AUTOMOVIL");
                System.out.println("Ingrese el piso");
                f=teclado.nextInt();
                System.out.println("Ingrese el espacio");
                c=teclado.nextInt();
                
                Matriz[f][c]=1;
                break;
            case 2:
                System.out.println("RETIRO DEL AUTOMOVIL");
                System.out.println("Ingrese el piso");
                f=teclado.nextInt();
                System.out.println("Ingrese el espacio");
                c=teclado.nextInt();
                
                Matriz[f][c]=0;
                break;
            case 3:
                System.out.println("MOSTRAR POSICIONES DE LOS AUTOS Y ESPACIOS VACIOS");
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        
                        System.out.printf("%-5s", +Matriz[i][j]+ " ");
                        
                    }
                    System.out.println();
                    
                }
                break;
            case 4:
                System.out.println("MOSTRAR ESTADISTICAS (ESPACIOS VACIOS/");
                
                for (int i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        
                        if (Matriz[i][j]==1) {
                            
                            ocupados++;
                            
                        }
                        
                    }
                    
                }
                System.out.println("Espacios Ocupados: "+ocupados);
                System.out.println("Espacios Libres: "+(50-ocupados));
                break;
            case 5:
                System.out.println("REGRESAR AL MENU");   
                break;
            }
        }
    }
}