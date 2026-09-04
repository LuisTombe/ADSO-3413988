/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject15;

import java.util.Scanner;

/**
 *
 * @author ~ Shino ~
 */
public class TipoDeTriangulos13 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
        
        double L1,L2,L3;
        
        System.out.println("Porfavor ingresa el valor del lado 1");
        L1=teclado.nextDouble();
        System.out.println("Porfavor ingresa el valor del lado 2");
        L2=teclado.nextDouble();
        System.out.println("Porfavor ingresa el valor del lado 3");
        L3=teclado.nextDouble();
        
        if ((L1!=L2)&&(L2!=L3)&&(L3!=L1))
            System.out.println("Su triangulo es escaleno");
        
    else if((L1==L2)&&(L2==L3))
        System.out.println("Su triangulo es equilatero");
else
        System.out.println("Su triangulo es Isósceles");}}
