/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array10numeros;

import java.util.Random;

/**
 *
 * @author ~ Shino ~
 */
public class Array10numeros {

    public static void main(String[] args) {
        System.out.println("Array de 10 numeros");
        Random random = new Random ();
        int [] array10numeros=new int [10];
        
        for (int i = 0; i < array10numeros.length; i++) {
            array10numeros[i]=random.nextInt(10);
        }
        
        for (int i = 0; i < array10numeros.length; i++) {
            System.out.print(array10numeros[i]+ " ");
        }
        System.out.println();
    }
}
