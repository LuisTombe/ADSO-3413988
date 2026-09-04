/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizsimetrica;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class MatrizSimetrica {

    public static void main(String[] args) {
        System.out.println("Matriz Simetrica");
        
        int MatrizSimetrica[][] = {
            {1,2,3},
            {2,5,6},
            {3,6,9}
        };
        boolean simetrico=true;
        
        for (int i = 0; i < MatrizSimetrica.length; i++) {
            for (int j = 0; j < MatrizSimetrica[i].length; j++) {
                
                System.out.print(MatrizSimetrica[i][j]+ " ");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        
        for (int i = 0; i < MatrizSimetrica.length; i++) {
            for (int j = 0; j < MatrizSimetrica[i].length; j++) {
     
                if (MatrizSimetrica[i][j] != MatrizSimetrica[j][i]) {
                    simetrico=false;
                }
            }
        }
        if (simetrico) {
            System.out.println("Es simetrica");
        }else{
            System.out.println("No es simetrica");
        }
    }
}
