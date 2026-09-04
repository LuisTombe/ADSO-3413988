/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio41;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Ejercicio41 {

    public static void main(String[] args) {
        System.out.println("Sistema de inventario multinivel");
        Scanner teclado = new Scanner (System.in);
        String [][] Matriz = new String [5][5];
        int NP,IT = 100,TI=0;
        Matriz[0][0]="Usuario";
        Matriz[0][1]="Netflix";
        Matriz[0][2]="Prime Video";
        Matriz[0][3]="Disney+";
        Matriz[0][4]="HBO Max";
        
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                if (j==0) {
                    
                System.out.println("Digite el nombre del producto "+i);
                Matriz[i][j]=teclado.nextLine();
                
                }else{
                    
                    System.out.println("Digite la cantidad del producto "+ Matriz[i][0]+ " en " + Matriz[0][j]);
                    
                    NP=teclado.nextInt();
                    
                    while (NP<0){
                        
                    
                    System.out.println("ERROR. No se permiten negativos.");

                    
                    NP=teclado.nextInt();
                    
                    }
                    
                    Matriz[i][j]=String.valueOf(NP);
                    
                    teclado.nextLine();
                    
                }
            }
        }
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                
                System.out.printf("%-15s", Matriz[i][j]+ " ");
                
            }
            
            System.out.println();
        }
        System.out.println("----------------------");
        for (int i = 1; i < Matriz.length; i++) {
            int IVF=0;
            for (int j = 1; j < Matriz[i].length; j++) {
                
                IVF += Integer.valueOf(Matriz[i][j]);
            }
            
            System.out.println("El total del producto " + Matriz[i][0]+ " es: " + IVF);
            
            }
        
        System.out.println("---------------------------------");
        for (int i = 1; i < Matriz.length; i++) {
            for (int j = 1; j < Matriz.length; j++) {
                
                TI += Integer.valueOf(Matriz[i][j]);
            }
        }
                
                if (IT<TI) {
                    System.out.println("SE DETECTO SOBRESTOCK");
                }
                
                else{
                    System.out.println("Inventario con correcto stock");
                }           
                System.out.println("Inventario total = "+TI);
        }

}

    
