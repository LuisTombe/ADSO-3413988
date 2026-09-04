/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parqueadero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Parqueadero {

    public static void main(String[] args) {
        System.out.println("Parqueadero");
        
        
        int [][] parqueadero = new int [10][10];
        Scanner teclado = new Scanner (System.in);
        Random random = new Random ();
        
        int fila=0;
        int columna=0;
        
        for (int i = 0; i < parqueadero.length; i++) {
            for (int j = 0; j < parqueadero[i].length; j++) {
                
                parqueadero[i][j]=random.nextInt(2);
                
            }
        }
        
        for (int i = 0; i < parqueadero.length; i++) {
            for (int j = 0; j < parqueadero[i].length; j++) {
                
                System.out.printf("%-5s", +parqueadero[i][j]+ " ");
                
            }
            System.out.println();
        }
        
        while(true){
            
            int op=0;
            int f=0,c=0;
            System.out.println("MENU...");
            System.out.println("(0).Instrucciones.");
            System.out.println("(1).Registrar vehiculo.");
            System.out.println("(2).Asignar espacio automaticamente.");
            System.out.println("(3).Detectar espacios libres.");
            System.out.println("(4).Ocupaciones por piso.");
            System.out.println("(5).Mostrar Parqueadero.");
            System.out.println("(6).Apagar sistema.");
            System.out.println("Elija una opcion.");
            op=teclado.nextInt();
            
            switch(op){
                
                case(0):
                    System.out.println("INSTRUCCIONES");
                    System.out.println("0 = Espacio libre");
                    System.out.println("1 = Espacio ocupado");
                    System.out.println("2 = Tu vehículo");
                    break;
                
                case (1):

                    System.out.println("Digite posicion en [fila][columna]");
                    System.out.println("Ingrese [Fila]: ");
                    f=teclado.nextInt();
                    System.out.println("Ingrese [Columna]: ");
                    c=teclado.nextInt();
                    
                    if (f < 0 || f >= 10 || c < 0 || c >= 10) {
                        System.out.println("Posición inválida.");
                        break;
                    }
                    
                    switch(parqueadero[f][c]){
                        
                        case(0):
                            parqueadero[f][c]=2;
                            System.out.println("¡Vehiculo ingresado correctamente!");
                            System.out.println("Su vehiculo esta en posicion [fila]: "+f+" [columna]: "+c);
                            
                            System.out.println("Parqueadero Actualizado:");
                            for (int i = 0; i < parqueadero.length; i++) {
                                for (int j = 0; j < parqueadero[i].length; j++) {
                                    
                                    System.out.printf("%-5s", parqueadero[i][j]+ " ");
                                    
                                }
                                System.out.println();
                            }
                            break;
                        
                        case(1):
                            System.out.println("Posicion ocupada...");
                            System.out.println("Intente otra posicion.");
                            break;
                        
                        case(2):
                            System.out.println("Ya tienes un vehiculo en esta posicion.");
                            System.out.println("Intente otra posicion.");
                            break;
                    }
                    break;
                    
                case (2):
                    
                    System.out.println("Asignando espacio automáticamente...");
                    boolean encontrado = false;
                    
                    int libres = 0;
                    
                    for (int i = 0; i < parqueadero.length; i++) {
                        for (int j = 0; j < parqueadero[i].length; j++) {
                            
                            if (parqueadero[i][j] == 0) {
                                libres++;
                            }
                        }
                    }
                    
                    if (libres == 0) {
                        System.out.println("No existen espacios disponibles.");
                        break;
                        
                    }
                    
                    while (!encontrado) {
                        
                        int filaRandom = random.nextInt(10);
                        int columnaRandom = random.nextInt(10);
                        
                        if (parqueadero[filaRandom][columnaRandom] == 0) {
                            parqueadero[filaRandom][columnaRandom] = 2;
                            
                            System.out.println("Vehículo asignado correctamente.");
                            System.out.println("Fila: " + filaRandom);
                            System.out.println("Columna: " + columnaRandom);
                            
                            encontrado = true;
                            
                            System.out.println("Parqueadero Actualizado:");
                            for (int i = 0; i < parqueadero.length; i++) {
                                for (int j = 0; j < parqueadero[i].length; j++) {
                                    
                                    System.out.printf("%-5s", parqueadero[i][j]+ " ");
                                    
                                }
                                System.out.println();
                            }
                        }
                    }
                    break;

                case(3):
                    
                    System.out.println("Espacios Libres");
                    int espacios=0;
                    for (int i = 0; i < parqueadero.length; i++) {
                        for (int j = 0; j < parqueadero[i].length; j++) {
                            
                            if (parqueadero[i][j]==0) {
                                espacios++;
                                
                                System.out.println("Espacio libre en : Fila " + i + " Columna " + j);
                               
                            }
                        }
                    }
                    break;
                    
                case(4):
                    
                    System.out.println("Espacios Ocupados");
                    int espaciosocupados=0;
                    for (int i = 0; i < parqueadero.length; i++) {
                        for (int j = 0; j < parqueadero[i].length; j++) {
                            
                            if (parqueadero[i][j]==1) {
                                espaciosocupados++;
                                
                                System.out.println("Espacio ocupado en : Fila " + i + " Columna " + j);
                                
                            }
                        }
                    }
                    break;
                    
                case(5):
                    
                    System.out.println("SU PARQUEADERO");
                    for (int i = 0; i < parqueadero.length; i++) {
                        for (int j = 0; j < parqueadero[i].length; j++) {
                            
                            System.out.printf("%-5s", +parqueadero[i][j]+ " ");
                            
                        }
                        System.out.println();
                        
                    }
                    break;
                
                case(6):
                    
                    System.out.println("Sistema apagado...");
                    return;
            }
        }
    }
}
