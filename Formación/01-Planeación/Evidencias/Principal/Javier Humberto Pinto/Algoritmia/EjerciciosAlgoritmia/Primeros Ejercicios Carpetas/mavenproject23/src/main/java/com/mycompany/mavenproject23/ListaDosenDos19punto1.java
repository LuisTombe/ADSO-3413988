/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject23;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class ListaDosenDos19punto1 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        int N;
        System.out.println("Sistema de listado de 2 en 2");
        System.out.println("Ingrese un numero cualquiera");
        N=teclado.nextInt();
        
        
        for (int K = 1; K <= 5; K++) {
            System.out.println(N);
            N = N + 2;
        }
    }
}

