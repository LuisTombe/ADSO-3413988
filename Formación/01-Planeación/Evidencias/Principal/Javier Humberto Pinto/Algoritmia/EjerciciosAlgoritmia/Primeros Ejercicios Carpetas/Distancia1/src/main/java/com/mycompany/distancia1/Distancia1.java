/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.distancia1;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class Distancia1 {

    public static void main(String[] args) {
        
        int a,b,c;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Porfavor digite el valor de la velocidad (V)");
        a=teclado.nextInt();
        System.out.println("Porfavor digite el valor del tiempo (T)");
        b=teclado.nextInt();
        c=a*b;
        System.out.println("La distancia recorrida es el resultado de "+a+" multiplicado "+b+" que es igual a "+c);        
    }
}
