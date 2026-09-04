/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject29;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Mavenproject29 {

    public static void main(String[] args) {
        int PN,SN,P;
        Scanner teclado=new Scanner (System.in);
        
        
        System.out.println("Algoritmito que solicita 2 números enteros y muestra el producto (Con método de sumas sucesivas)");
        System.out.println("Escriba el primer numero (PN)");
        PN=teclado.nextInt();
        System.out.println("Escriba el segundo numero (SN)");
        SN=teclado.nextInt();
        P=0;
        
        
        for (int K = 1; K <= SN; K++){
            P=P+PN;
        } 
                System.out.println("Producto es "+P);
            }
        }
