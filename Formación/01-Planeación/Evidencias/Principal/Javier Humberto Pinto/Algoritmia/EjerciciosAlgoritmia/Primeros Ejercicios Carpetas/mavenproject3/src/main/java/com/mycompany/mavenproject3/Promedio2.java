/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.util.Scanner;

/**
 *
 * @author SoporteSENA
 */
public class Promedio2 {

    public static void main(String[] args) {
        
        double n1,n2,n3,p;
        Scanner teclado=new Scanner (System.in);
        System.out.println("Porfavor digite la primera nota");
        n1=teclado.nextDouble();
        System.out.println("Porfavor digite la segunda nota");
        n2=teclado.nextDouble();
        System.out.println("Porfavor digite la tercera nota");
        n3=teclado.nextDouble();
        p=(n1+n2+n3)/3;
        System.out.println("El promedio es la suma de "+n1+" mas "+n2+" mas "+n3+" dividido entre 3, que da como resultado "+p);
    }
}
