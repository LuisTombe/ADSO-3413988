/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabonita;

import static com.mycompany.calculadorabonita.CalculadoraBonita.a;
import static com.mycompany.calculadorabonita.CalculadoraBonita.b;
import static com.mycompany.calculadorabonita.CalculadoraBonita.teclado;

/**
 *
 * @author ~ Shino ~
 */
public class Datos {
    public static void datos(){
        System.out.println("Porfavor ingrese el valor de a");
        a=teclado.nextInt();
        System.out.println("Porfavor ingrese el valor de b");
        b=teclado.nextInt();
    }
}
