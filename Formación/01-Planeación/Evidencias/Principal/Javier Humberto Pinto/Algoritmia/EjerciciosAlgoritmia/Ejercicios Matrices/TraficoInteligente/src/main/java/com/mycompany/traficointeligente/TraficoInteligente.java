/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.traficointeligente;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class TraficoInteligente {

    public static void main(String[] args) {
        System.out.println("Trafico Inteligente");
        
        int Matriz[][] = {
            {1,0,2,0},
            {1,3,2,0},
            {0,2,1,3}
        };
                
        for (int c = 0; c <= Matriz.length; c++) {
            
            for (int i = 0; i < Matriz.length; i++) {
                for (int j = Matriz[i].length -1; j >= 0; j--) {
                    
                    if (Matriz[i][j]==1) {
                        
                        if (j+1 < Matriz[i].length && Matriz[i][j+1]==0) {
                            
                        }
                        
                    }
                    
                }
                
                
                
            }
                System.out.print(Matriz[i][j]+ " ");
                System.out.print(" ");
            }
            
            System.out.println(" ");
                
            }
            
        }
    }
