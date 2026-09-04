/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorabonita;

import static com.mycompany.calculadorabonita.CalculadoraBonita.op;
import static com.mycompany.calculadorabonita.CalculadoraBonita.teclado;

/**
 *
 * @author ~ Shino ~
 */
public class Menu {
    
    public static void menu(){
        System.out.println("Porfavor ingrese el operador que va a usar");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicacion (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Potenciacion (^)");
        System.out.println("6. Radicacion (%)");
        System.out.println("7. Tangente");
        System.out.println("8. Salir");
        op=teclado.nextInt();
    
    }
}
